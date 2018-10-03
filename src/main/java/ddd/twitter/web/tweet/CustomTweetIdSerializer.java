package ddd.twitter.web.tweet;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import ddd.twitter.model.tweet.TweetId;

import java.io.IOException;

public class CustomTweetIdSerializer extends JsonSerializer<TweetId> {
    @Override
    public void serialize(TweetId value, JsonGenerator generator, SerializerProvider serializers) throws IOException {
        generator.writeString(value.format());
    }
}
