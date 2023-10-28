package it.digitalnucleus.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * Enables the scan of the base package relative to this class.
 * If you want to add additional packages, use the scanBasePackages value
 * for the annotation.
 */
@SpringBootApplication(
		/* Explicitly list packages to scan */
		scanBasePackages = {
				"it.digitalnucleus.springcoredemo",
				"it.digitalnucleus.outsidepackage"
		}
)
public class SpringCoreDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringCoreDemoApplication.class, args);
	}

}
