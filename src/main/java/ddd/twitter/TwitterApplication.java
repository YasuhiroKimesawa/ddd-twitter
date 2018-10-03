package ddd.twitter;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TwitterApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwitterApplication.class, args);
	}

	@Bean
	public ObjectMapper directFieldAccess() {
		return new CustomObjectMapper().ofDirectFieldAccess();
	}
}
