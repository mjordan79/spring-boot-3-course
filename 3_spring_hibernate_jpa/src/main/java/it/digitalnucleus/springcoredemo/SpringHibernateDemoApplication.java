package it.digitalnucleus.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * Enables the scan of the base package relative to this class.
 * If you want to add additional packages, use the scanBasePackages value
 * for the annotation.
 */
@SpringBootApplication
@RestController
public class SpringHibernateDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringHibernateDemoApplication.class, args);
	}

	@GetMapping("/jpademo")
	public String getJPADemo() {
		return "Hello from Spring Hibernate!";
	}

}
