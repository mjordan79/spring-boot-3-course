package it.digitalnucleus.springcoredemo.rest;

import it.digitalnucleus.outsidepackage.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoJavaConfigInjection {

    private final Coach swimCoach;

    @Autowired
    public DemoJavaConfigInjection(@Qualifier("swimCoach") Coach swimCoach) {
        this.swimCoach = swimCoach;
    }

    @GetMapping("/javaconfig")
    public String getInfo() {
        return swimCoach.getDailyWorkout();
    }

}
