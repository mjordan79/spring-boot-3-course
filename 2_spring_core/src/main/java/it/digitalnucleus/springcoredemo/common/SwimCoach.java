package it.digitalnucleus.springcoredemo.common;

import it.digitalnucleus.outsidepackage.Coach;

/* This class is not annotated with the @Component annotation.
 * It will be configured as a Spring bean through Java Config class and
 * the @Bean annotation.
 */
public class SwimCoach implements Coach {

    public SwimCoach() {
        System.out.println("Inside constructor: " + this.getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warmup";
    }
}
