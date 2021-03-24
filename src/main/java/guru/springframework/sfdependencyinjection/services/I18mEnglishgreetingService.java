package guru.springframework.sfdependencyinjection.services;

public class I18mEnglishgreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
