package it.digitalnucleus.springcoredemo.rest;

import it.digitalnucleus.outsidepackage.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * Constructor Injection Example.
 * Generally used for mandatory dependencies.
 */
@RestController
public class DemoConstructorInjectionController {
    private final Coach myCoach;

    @Autowired
    public DemoConstructorInjectionController(@Qualifier("baseballCoach") Coach coach) {
        this.myCoach = coach;
    }

    @GetMapping("/dailyworkoutconstructor")
    public String getDailyWorkout() {
        return this.myCoach.getDailyWorkout();
    }

}
