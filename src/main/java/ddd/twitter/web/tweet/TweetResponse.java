package ddd.twitter.web.tweet;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import ddd.twitter.model.tweet.Message;
import ddd.twitter.model.tweet.Tweet;
import ddd.twitter.model.tweet.TweetId;

class TweetResponse {

    @JsonSerialize(using = CustomTweetIdSerializer.class)
    private TweetId id ;
    private Message message;

    TweetResponse(Tweet model) {
        this.id = model.id();
        this.message = model.message();
    }

    @Override
    public String toString() {
        return "TweetResponse{" +
                "id=" + id +
                ", message=" + message +
                '}';
    }
}
