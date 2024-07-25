package project;
public class Tweet {
    private String TweetID;
    private String HandLabel;
    private String AnnotatorID;
    private Tweet prox;

    public Tweet(String TweetID, String HandLabel, String AnnotatorID){
        this.TweetID = TweetID;
        this.HandLabel = HandLabel;
        this.AnnotatorID = AnnotatorID;
    }

    public String getTweetId(){
        return TweetID;
    }
    public String getHandLabel(){
        return HandLabel;
    }
    public String getAnnotatorID(){
        return AnnotatorID;
    }
    public Tweet getprox(){
        return prox;
    }
    public void setProx(Tweet prox){
        this.prox = prox;
    }
}
