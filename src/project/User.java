package project;

public class User {
     private String id;
     private int amountLanguage;
     private String countries;
     private User next;

     public User(String id) {
          this.id = id;
          this.countries = "";
          this.amountLanguage = 0;
     }

     public String getId() {
          return id;
     }

     public String getCountries() {
          return countries;
     }

     public int getAmountUsers() {
          return amountLanguage;
     }

     public void setNext(User user) {
          next = user;
     }

     public void setCountries(String country) {
          countries += country + ";";
     }

     public User getNext() {
          return next;
     }

     public void incrementAmount() {
          this.amountLanguage++;
     }
}