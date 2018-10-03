package ddd.twitter.web.tweet;

import ddd.twitter.model.tweet.Tweet;
import ddd.twitter.model.tweet.TweetId;
import ddd.twitter.service.tweet.TweetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tweet")
public class TweetController {

    @Autowired
    private TweetService service;

    @RequestMapping(method = RequestMethod.POST)
    public TweetResponse tweetOfJson(@RequestBody @Validated TweetRequest request)
    {
        return generateTweetResponse(request);
    }

    private TweetResponse generateTweetResponse(TweetRequest request)
    {
        Tweet tweet = service.generate(request.message());
        service.doTweet(tweet);
        return new TweetResponse(tweet);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public TweetResponse findById(@PathVariable("id") String id)
    {
        Tweet tweet = service.findBy(new TweetId(id));
        return new TweetResponse(tweet);
    }

}
