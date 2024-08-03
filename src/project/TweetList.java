package project;

public class TweetList {
     private Tweet first;
     private int amount;
     private int positive;
     private int negative;
     private int neutral;

     public TweetList() {
          first = null;
          positive = 0;
          negative = 0;
          neutral = 0;
          amount = 0;
     }

     public void insertInBeginning(Tweet t) {
          amount++;

          t.setNext(first);
          first = t;

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

     public Tweet getFirst() {
          return first;
     }

     public int getAmount() {
          return amount;
     }

     public int getPositiveTweets() {
          return positive;
     }

     public int getNegativeTweets() {
          return negative;
     }

     public int getNeutralTweets() {
          return neutral;
     }
}