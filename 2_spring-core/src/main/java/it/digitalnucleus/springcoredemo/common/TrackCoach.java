package it.digitalnucleus.springcoredemo.common;

import it.digitalnucleus.outsidepackage.Coach;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {

    public TrackCoach() {
        System.out.println("In constructor: " + this.getClass().getName());
    }

    @Override
    public String getDailyWorkout() {
        return "Track: Run a hard 5k!";
    }
}
