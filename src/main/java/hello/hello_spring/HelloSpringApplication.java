package hello.hello_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringApplication {

	public static void main(String[] args) {
		System.out.println("hello");
		System.out.println();
		SpringApplication.run(HelloSpringApplication.class, args);
	}

}
