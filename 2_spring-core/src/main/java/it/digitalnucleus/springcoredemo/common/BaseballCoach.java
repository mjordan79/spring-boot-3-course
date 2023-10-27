package it.digitalnucleus.springcoredemo.common;

import it.digitalnucleus.outsidepackage.Coach;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

    // It will print a message during startup while instantiating beans.
    public BaseballCoach() {
        System.out.println("In constructor: " + this.getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Baseball: Spend 30 minutes in batting practice";
    }
}
