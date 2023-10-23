package it.digitalnucleus.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * Constructor Injection Example.
 * Generally used for mandatory dependencies.
 */
@RestController
public class DemoController {
    private final Coach myCoach;

    @Autowired
    public DemoController(Coach coach) {
        this.myCoach = coach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return this.myCoach.getDailyWorkout();
    }

}
