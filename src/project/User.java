package project;

public class User {
     private String id;
     private int amount;
     private User next;

     public User(String id){
          this.id = id;
          this.amount = 0;
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