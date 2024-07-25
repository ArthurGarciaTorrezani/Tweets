package project;

public class LanguageTweet {
     private Tweet head;
     private int amount;
     private int positive;
     private int negative;
     private int neutral;

     public LanguageTweet() {
          head = new Tweet("void", "void", "void");
          head.setProx(head);
     }

     public void insertInFinal(Tweet t){
          t.setProx(head);
          head.setProx(t);
     }

     public int getamount() {
          return amount;
     }

     public void setamount(int amount) {
          this.amount = amount;
     }

     public int getpositives() {
          return positive;
     }

     public void setpositives(int positive) {
          this.positive = positive;
     }

     public int getNegativos() {
          return negative;
     }

     public void setNegativos(int negative) {
          this.negative = negative;
     }

     public int getNeutros() {
          return neutral;
     }

     public void setNeutros(int neutral) {
          this.neutral = neutral;
     }
}