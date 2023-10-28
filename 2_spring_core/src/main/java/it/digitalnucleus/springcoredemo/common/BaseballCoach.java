package it.digitalnucleus.springcoredemo.common;

import it.digitalnucleus.outsidepackage.Coach;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/* Remember: by default Spring Beans are Singletons (all injections use the same instance)
 * Prototype scoped beans are @Lazy by default. Also, Spring won't invoke @PreDestroy methods.
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
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
