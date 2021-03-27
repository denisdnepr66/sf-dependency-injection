package guru.springframework.sfdependencyinjection.services;

import guru.springframework.sfdependencyinjection.repositories.EnglishGreetingRepository;

public class I18mEnglishGreetingService implements GreetingService {

    private final EnglishGreetingRepository englishGreetingRepository;

    public I18mEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository) {
        this.englishGreetingRepository = englishGreetingRepository;
    }

    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
