package deres12.springframework.sfgspringexample.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "PropertyGreeting Hello World";
    }
}
