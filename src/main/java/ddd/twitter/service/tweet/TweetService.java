package ddd.twitter.service.tweet;

import ddd.twitter.model.tweet.Tweet;
import ddd.twitter.model.tweet.TweetFactory;
import ddd.twitter.model.tweet.TweetId;
import ddd.twitter.model.tweet.TweetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TweetService
{

    @Autowired
    private TweetFactory factory;

    @Autowired
    private TweetRepository repository;

    public Tweet generate(String message)
    {
        return factory.generate(message);
    }

    public void doTweet(Tweet tweet)
    {
        repository.register(tweet);
    }

    public Tweet findBy(TweetId id)
    {
        return repository.findBy(id);
    }
}
