package it.digitalnucleus.springcoredemo.common;

import it.digitalnucleus.outsidepackage.Coach;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class TennisCoach implements Coach {

    // It will print a message during startup while instantiating beans.
    public TennisCoach() {
        System.out.println("In constructor: " + this.getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Tennis: Practice your backhand volley";
    }
}
