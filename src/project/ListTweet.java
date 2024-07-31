package project;

public class ListTweet {
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
          t.setNextTweet(head);
          head = t;
          amount++;

          if (t.getHandLabel().equals("Neutral")) {
               neutral++;
          }
          if (t.getHandLabel().equals("Positive")) {
               positive++;
          }
          if (t.getHandLabel().equals("Negative")) {
               negative++;
          }
     }

     public void print() {
          Tweet tweetAux = head;
          while (tweetAux != null) {
               System.out.println(tweetAux.getAnnotatorID());
               tweetAux = tweetAux.getNextTweet();
          }
     }

     public void getFeelings() {
          System.out.println("Negative: " + negative + ", Positive: " + positive + ", Neutral: " + neutral);
     }

     public int getAmount() {
          return amount;
     }

     public void setAmount(int amount) {
          this.amount = amount;
     }

     public int getPositiveTweets() {
          return positive;
     }

     public void setPositiveTweets(int positive) {
          this.positive = positive;
     }

     public int getNegativeTweets() {
          return negative;
     }

     public void setNegativeTweets(int negative) {
          this.negative = negative;
     }

     public int getNeutralTweets() {
          return neutral;
     }

     public void setNeutralTweets(int neutral) {
          this.neutral = neutral;
     }
}