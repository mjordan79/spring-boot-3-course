package it.digitalnucleus.springcoredemo.config;

import it.digitalnucleus.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
 * The bean ID for a bean constructed through the @Bean annotation is the name of the method,
 * unless a name is provided with the @Bean annotation.
 * Here, swimCoach will be used in the @Qualifier annotation.
 * Java Config for instantiating beans is used when you need to use external classes as a Spring bean.
 */
@Configuration
public class SportConfiguration {

    // It will instantiate a bean and make it a Spring Bean.
    @Bean("swimCoach")
    public SwimCoach getInitializationSwimCoach() {
        return new SwimCoach();
    }
}
