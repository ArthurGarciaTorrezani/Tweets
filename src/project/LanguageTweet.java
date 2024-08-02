package project;

public class LanguageTweet {

     private ListTweet listOfTweets;
     private String languageName;
     private LanguageTweet next;

     public LanguageTweet(String nameLang) {
          this.languageName = nameLang;
     }

     public void setNext(LanguageTweet next) {
          this.next = next;
     }

     public void setList(ListTweet list) {
          this.listOfTweets = list;
     }

     public LanguageTweet getNextLanguageTweet() {
          return next;
     }

     public ListTweet getListTweet() {
          return listOfTweets;
     }

     public String getLanguageName() {
          return languageName;
     }
}
