package project;

public class Language {
    private String language;
    private UserList userList;
    private TweetList tweets;
    private Language next;

    public Language(String language) {
        this.language = language;
    }

    public String getName() {
        return language;
    }

    public void setNext(Language next) {
        this.next = next;
    }

    public Language getNext() {
        return next;
    }

    public void insertUsers(UserList users) {
        this.userList = users;
    }

    public UserList getUsers() {
        return userList;
    }

    public void insertTweets(TweetList t) {
        this.tweets = t;
    }

    public TweetList getTweets() {
        return tweets;
    }
}