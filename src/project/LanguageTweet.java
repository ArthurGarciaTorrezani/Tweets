package project;

public class LanguageTweet {
     private Tweet head;
     private int amount;
     private int positive;
     private int negative;
     private int neutral;
     private String language;

     public LanguageTweet(String language) {
          head = new Tweet("void", "void", "void");
          head.setProx(null);
          this.language = language;
     }

     public void insertInBeginning(Tweet t) {
          if(head.getprox() != null){ // verifica se a lista ta vazia
               t.setProx(head.getprox());
               head.setProx(t);         
          }else{ 
               head.setProx(t);
               t.setProx(null);
          }
     }

     public void print(){
          Tweet aux = head;
          while (aux != null) {
               System.out.println(aux.getAnnotatorID());
               aux = aux.getprox();
          }
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

     public String getLanguage(){
          return language;
     }
}