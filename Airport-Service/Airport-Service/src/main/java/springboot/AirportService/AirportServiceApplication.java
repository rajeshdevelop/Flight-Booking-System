package springboot.AirportService;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class AirportServiceApplication {
	
	

	public static void main(String[] args) {
		SpringApplication.run(AirportServiceApplication.class, args);
	}

}
