package ddd.twitter.model.tweet;

public class TweetId {

    private String id;

    public TweetId(String id) {
        this.id = id;
    }

    public String format() {
        return String.format("TweetId:%s", this.id);
    }
}
