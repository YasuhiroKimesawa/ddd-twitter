package ddd.twitter.model.tweet;

public interface TweetRepository
{
    void register(Tweet tweet);

    Tweet findBy(TweetId id);
}
