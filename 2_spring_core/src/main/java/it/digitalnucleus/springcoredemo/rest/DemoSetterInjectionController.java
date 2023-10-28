package it.digitalnucleus.springcoredemo.rest;

import it.digitalnucleus.outsidepackage.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * Setter Injection Example.
 * Generally used for optional dependencies.
 */
@RestController
public class DemoSetterInjectionController {

    private Coach myCoach;

    // No qualifier. The primary bean is the tennisCoach.
    @Autowired
    public void setMyCoach(Coach myCoach) {
        this.myCoach = myCoach;
    }

    @GetMapping("/dailyworkoutsetter")
    public String getDailyWorkout() {
        return this.myCoach.getDailyWorkout();
    }

}
