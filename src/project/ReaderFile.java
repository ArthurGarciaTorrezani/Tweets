package project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReaderFile {
     public static void ler(String path) {
          LanguageTweet lang = new LanguageTweet("Albania");
          Tweet tweet;
          try {
               FileReader arq = new FileReader(path);
               BufferedReader lerArq = new BufferedReader(arq);
               String line = lerArq.readLine();
               ListUser users = new ListUser();
               User user;
               while (line != null) {
                    String[] content = line.split(",");
                    tweet = new Tweet(content[0], content[1], content[2]);
                    lang.insertInBeginning(tweet);
                    users.search(tweet.getAnnotatorID());
                    line = lerArq.readLine();
               }

               lang.print();
               System.out.println("-============================");
               lang.getFeelings();
               System.out.println("================================");
               users.print();
               System.out.println("===============================");
               arq.close();
          } catch (IOException e) {
               System.err.printf("Erro na abertura do arquivo: %s.\n",
                         e.getMessage());
          }
     }
}
