package deres12.springframework.sfgspringexample.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "ConstructorGreeting Hello World";
    }
}
