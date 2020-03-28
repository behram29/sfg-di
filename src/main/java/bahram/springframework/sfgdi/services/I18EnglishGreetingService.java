package bahram.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("I18nService")
public class I18EnglishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World ( English )";
    }
}