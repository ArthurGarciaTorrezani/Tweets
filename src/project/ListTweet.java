package project;

public class ListTweet { // usa uma lista encadeada simples
     private Tweet head;
     private int amount;
     private int positive;
     private int negative;
     private int neutral;

     public ListTweet() {
          head = null;
          positive = 0;
          negative = 0;
          neutral = 0;
          amount = 0;
     }

     public void insertInBeginning(Tweet t) {
          t.setProx(head);
          head = t;
          amount++;
          if(t.getHandLabel().equals("Neutral")){
               neutral++;
          }
          if(t.getHandLabel().equals("Positive")){
               positive++;
          }
          if(t.getHandLabel().equals("Negative")){
               negative++;
          }
     }

     public void print() {
          Tweet aux = head;
          while (aux != null) {
               System.out.println(aux.getAnnotatorID());
               aux = aux.getprox();
          }
     }

     public void getFeelings(){
          System.out.println("Negative: "+negative + ", Positive: " + positive + ", Neutral: " + neutral);
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