package ddd.twitter.model.tweet;

public class Message
{
    private String value;

    public Message(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Message{" +
                "value='" + value + '\'' +
                '}';
    }
}
