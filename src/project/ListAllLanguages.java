package project;

public class ListAllLanguages {
     private LanguageTweet first;

     public ListAllLanguages(){
          first = null;
      }

     public void insertInBeginning(LanguageTweet lang) {
          lang.setProx(first);
          first = lang;
     }
}
