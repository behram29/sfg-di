package bahram.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("SP")
@Service("I18nService")
public class I18SpanishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Bella Chao( Spanish )";
    }
}
