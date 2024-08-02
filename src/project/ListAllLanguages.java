package project;

public class ListAllLanguages {
     private LanguageTweet first;
     private Tweet tweet;

     public ListAllLanguages(){
          first = null;
      }

     public void insertInBeginning(LanguageTweet lang) {
          lang.setNext(first);
          first = lang;
     }

     public void print() {
          LanguageTweet current = first;
          while (current != null) {
              System.out.printf("Name: %d\n", current.getNextLanguageTweet());
              current = current.getNextLanguageTweet();
          }
      }
}
