package learner.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String greeting(){
        System.out.println("Hello Spring!!");
        return "Hi Folks!";
    }

}
