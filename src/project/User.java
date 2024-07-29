package project;

public class User {
     private String id;
     private int amount;
     private User prox;
     public String getId() {
          return id;
     }

     public void setId(String id) {
          this.id = id;
     }

     public int getAmount() {
          return amount;
     }

     public User(String id){
          this.id = id;
          this.amount = 0;
     }

     public void setProx(User user){
          prox = user;
     }

     public void setAmount(){
          System.out.print("user: " + id + " amount: " + amount + " ");
          this.amount ++;
     }

     public User getProx(){
          return prox;
     }
}
