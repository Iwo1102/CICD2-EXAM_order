package ie.atu.exam2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Exam2Application {

	public static void main(String[] args) {
		SpringApplication.run(Exam2Application.class, args);
	}

}
