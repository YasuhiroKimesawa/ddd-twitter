package ddd.twitter.infrastructure.tweet;

import ddd.twitter.model.tweet.Message;
import ddd.twitter.model.tweet.Tweet;
import ddd.twitter.model.tweet.TweetFactory;
import ddd.twitter.model.tweet.TweetId;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class UUIDBaseTweetFactory implements TweetFactory
{
    @Override
    public Tweet generate(String message)
    {
        UUID uuid = UUID.randomUUID();
        return new Tweet(new TweetId(uuid.toString()), new Message(message));
    }
}
