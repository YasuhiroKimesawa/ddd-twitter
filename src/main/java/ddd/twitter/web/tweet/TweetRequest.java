package ddd.twitter.web.tweet;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class TweetRequest {

    @NotBlank
    @Size(min=2)
    private String message;

    public TweetRequest(String message) {
        this.message = message;
    }

    public TweetRequest() {
    }

    String message(){
        return this.message;
    }
}
