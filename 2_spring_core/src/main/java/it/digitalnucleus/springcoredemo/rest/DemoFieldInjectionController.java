package it.digitalnucleus.springcoredemo.rest;

import it.digitalnucleus.outsidepackage.Coach;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * Field Injection Example.
 * No longer used and discouraged by the Spring team.
 * It makes the code harder to unit test.
 */
@RestController
public class DemoFieldInjectionController {

    @Autowired
    @Qualifier("cricketCoach")
    private Coach myCoach;

    @PostConstruct
    public void doInitialize() {
        System.out.println("In PostConstruct Method: " + this.myCoach.getClass().getSimpleName());
    }

    @PreDestroy
    public void doCleanup() {
        System.out.println("In PreDestroy Method: " + this.myCoach.getClass().getSimpleName());
    }

    @GetMapping("/dailyworkoutfield")
    public String getDailyWorkout() {
        return this.myCoach.getDailyWorkout();
    }

}