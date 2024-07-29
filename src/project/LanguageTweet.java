package project;

public class LanguageTweet {
     private ListTweet list;
     private String nameLang;
     private LanguageTweet prox;

     public LanguageTweet(String nameLang) {
          this.nameLang = nameLang;
     }

     public void setProx(LanguageTweet prox) {
          this.prox = prox;
     }

     public void setList(ListTweet list) {
          this.list = list;
     }

     public LanguageTweet getProx() {
          return prox;
     }

     public ListTweet getListTweet() {
          return list;
     }

     public String getNameLang() {
          return nameLang;
     }
}
