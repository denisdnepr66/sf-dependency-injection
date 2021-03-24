package guru.springframework.sfdependencyinjection.config;


import guru.springframework.sfdependencyinjection.services.ConstructorGreetingService;
import guru.springframework.sfdependencyinjection.services.PropertyInjectedGreetingService;
import guru.springframework.sfdependencyinjection.services.SetterInjectedGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingServiceConfig {

    @Bean
    ConstructorGreetingService constructorGreetingService(){
        return new ConstructorGreetingService();
    }

    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService(){
        return new PropertyInjectedGreetingService();
    }
    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService(){
        return new SetterInjectedGreetingService();
    }
}
