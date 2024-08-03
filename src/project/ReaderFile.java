package project;

import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedReader;
import java.io.FileReader;

public class ReaderFile {

    static String languageName = "";
    static UserList userList = new UserList();
    static LanguageList languageList = new LanguageList();

    public static Language read(String path, String file, UserList users) {

        TweetList tweets = new TweetList();
        Language language = new Language(file);
        Tweet tweet;

        try {
            FileReader archive = new FileReader(path);
            BufferedReader reader = new BufferedReader(archive);
            String line = reader.readLine();

            while (line != null) {
                String[] content = line.split(",");

                String tweetId = content[0];
                String handLabel = content[1];
                String annotatorId = content[2];

                if (!annotatorId.toLowerCase().equals("annotatorid")) {
                    tweet = new Tweet(tweetId, handLabel, annotatorId);
                    tweets.insertInBeginning(tweet);
                    users.searchOrInsert(annotatorId, file);
                }

                
                line = reader.readLine();
            }

            language.insertUsers(users);
            language.insertTweets(tweets);

            reader.close();
            
        } catch (IOException e) {
            System.err.printf("Error opening file: %s\n", e.getMessage());
        }
        return language;
    }
    
    public static void openDir() {

        Path dir = Paths.get("src\\TwitterLanguages");

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
            for (Path archive : stream) {
                if (Files.isRegularFile(archive)) {
                    String archiveArr[] = archive.getFileName().toString().split("_");
                    languageName = archiveArr[0];
                    
                    Language languageObj = read("src\\TwitterLanguages\\" + archive.getFileName(), languageName, userList);
                    languageList.addLanguage(languageObj);
                }
            }

            languageList.volumeTweets();
            languageList.positiveFeelings();
            languageList.negativeFeelings();

            System.out.println("----------------------------------------------------");
            Language maxNegativeLanguage = languageList.getLanguageWithMostNegativeTweets();
            if (maxNegativeLanguage != null) {
                System.out.println("Language with most negative tweets: " + maxNegativeLanguage.getName());
            } else {
                System.out.println("No languages found.");
            }
            String rankedNegativesLanguages = languageList.rankLanguagesByNegativeTweets();
            System.out.println("Languages ranked by number of negative tweets:");
            System.out.println(rankedNegativesLanguages);

            System.out.println("----------------------------------------------------");

            Language maxPositveLanguage = languageList.getLanguageWithMostPositiveTweets();
            if (maxPositveLanguage != null) {
                System.out.println("Language with most positive tweets: " + maxPositveLanguage.getName());
            } else {
                System.out.println("No languages found.");
            }

            String rankedPositivesLanguages = languageList.rankLanguagesByPositiveTweets();
            System.out.println("Languages ranked by number of positive tweets:");
            System.out.println(rankedPositivesLanguages);

            userList.repeatedIdCountry();

        } catch (IOException | DirectoryIteratorException e) {
            System.err.printf("Error reading files: %s\n", e.getMessage());
        }
    }
}