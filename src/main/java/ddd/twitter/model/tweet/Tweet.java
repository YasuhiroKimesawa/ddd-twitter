package ddd.twitter.model.tweet;

import javax.validation.constraints.NotNull;

public class Tweet {
    private TweetId id;

    private Message message;

    public Tweet(@NotNull TweetId id, @NotNull Message message) {
        this.id = id;
        this.message = message;
    }

    public TweetId id(){
        return this.id;
    }

    public Message message(){
        return this.message;
    }
}
