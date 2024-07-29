package project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReaderFile {
     public static LanguageTweet ler(String path, ListUser users) {
          ListTweet listTweet = new ListTweet();
          Tweet tweet;
          LanguageTweet lang = new LanguageTweet("lingua");;
          try {
               FileReader arq = new FileReader(path);
               BufferedReader lerArq = new BufferedReader(arq);
               String line = lerArq.readLine();
               while (line != null) {
                    String[] content = line.split(",");
                    tweet = new Tweet(content[0], content[1], content[2]);
                    listTweet.insertInBeginning(tweet);
                    users.search(tweet.getAnnotatorID());
                    line = lerArq.readLine();
               }
               arq.close();
               lang.setList(listTweet);
          } catch (IOException e) {
               System.err.printf("Erro na abertura do arquivo: %s.\n",
                         e.getMessage());
          }
          System.out.println("AQUI TERMINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
          return lang;
     }
}
