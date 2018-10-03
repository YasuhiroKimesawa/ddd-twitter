package ddd.twitter.model.tweet;

import org.springframework.stereotype.Component;

@Component
public interface TweetFactory {
    public Tweet generate(String message);
}
