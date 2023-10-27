package it.digitalnucleus.springcoredemo.common;

import it.digitalnucleus.outsidepackage.Coach;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    // It will print a message during startup while instantiating beans.
    public CricketCoach() {
        System.out.println("In constructor: " + this.getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Cricket: Practice fast bowling for 15 minutes!!!";
    }
}
