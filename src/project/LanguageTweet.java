package project;

public class LanguageTweet{
     private Tweet primeiro;
     private int amount;
     private int positive;
     private int negative;
     private int neutral;

     public LanguageTweet(){
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