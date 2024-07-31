package project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReaderFile {
     public static LanguageTweet read(String path, ListUser users, String languageArchive) {

          ListTweet tweetList = new ListTweet();
          Tweet tweet;
          LanguageTweet language = new LanguageTweet(languageArchive);

          try {

               FileReader archive = new FileReader(path);
               BufferedReader readFile = new BufferedReader(archive);
               String line = readFile.readLine();

               while (line != null) {
                    String[] content = line.split(",");
                    tweet = new Tweet(content[0], content[1], content[2]);
                    tweetList.insertInBeginning(tweet);
                    users.searchOrInsert(tweet.getAnnotatorID());
                    line = readFile.readLine();
               }
               archive.close();
               language.setList(tweetList);

          } catch (IOException e) {
               System.err.printf("Erro na abertura do arquivo: %s.\n",
                         e.getMessage());
          }
          return language;
     }
}
