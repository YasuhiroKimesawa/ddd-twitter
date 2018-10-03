package ddd.twitter.infrastructure.tweet;

import ddd.twitter.model.tweet.Message;
import ddd.twitter.model.tweet.Tweet;
import ddd.twitter.model.tweet.TweetId;
import ddd.twitter.model.tweet.TweetRepository;
import org.springframework.stereotype.Repository;

@Repository
public class TweetDataSource implements TweetRepository {

    @Override
    public void register(Tweet tweet) {
     ;
    }

    @Override
    public Tweet findBy(TweetId id) {
        return new Tweet(new TweetId("abc"), new Message("abcde"));
    }
}
