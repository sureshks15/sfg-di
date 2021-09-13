package learner.springframework.sfgdi.service;

public class GreetingServiceImpl implements GreetingService{
    @Override
    public String greeting() {
        return "Hello Guys!";
    }
}
