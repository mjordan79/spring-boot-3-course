package it.digitalnucleus.springcoredemo.rest;

import it.digitalnucleus.outsidepackage.Coach;
import org.springframework.beans.factory.annotation.Autowired;
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
    private Coach myCoach;

    @GetMapping("/dailyworkoutfield")
    public String getDailyWorkout() {
        return this.myCoach.getDailyWorkout();
    }

}