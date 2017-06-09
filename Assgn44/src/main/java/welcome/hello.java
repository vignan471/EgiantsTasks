package welcome;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class hello {

    public static void main(String[] args) {
        SpringApplication.run(hello.class, args);
    }

    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(hello.class);
	}
}