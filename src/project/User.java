package project;

public class User {
     private String id;
     private int amount;
     private User next;
     private Country country;
     private ListUserCountries listCountries;

     public User(String id){
          listCountries = new ListUserCountries();
          this.id = id;
          this.amount = 0;
     }

     public void setCountry(String country){
          this.country = new Country(country);
          listCountries.insertAtBeginning(this.country);
     }

     public boolean searchCountry(String country){
          return listCountries.search(country);
     }

     public String getId() {
          return id;
     }

     public void setId(String id) {
          this.id = id;
     }

     public int getAmountUsers() {
          return amount;
     }

     public void setNextUser(User user){
          next = user;
     }

     public void incrementAmount(){
          this.amount ++;
     }

     public User getNextUser(){
          return next;
     }
}