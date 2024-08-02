package project;

public class Tweet {
    private String tweetID;
    private String handLabel;
    private String annotatorID;
    private String language;
    private Tweet next;


    public Tweet(String language, String tweetID, String handLabel, String annotatorID){
        this.language = language;
        this.tweetID = tweetID;
        this.handLabel = handLabel;
        this.annotatorID = annotatorID;
    }

    public String getLanguageName() {
        return language;
    }

    public String getTweetId(){
        return tweetID;
    }
    public String getHandLabel(){
        return handLabel;
    }
    public String getAnnotatorID(){
        return annotatorID;
    }
    public Tweet getNextTweet(){
        return next;
    }
    public void setNextTweet(Tweet nextTweet){
        this.next = next;
    }
}
