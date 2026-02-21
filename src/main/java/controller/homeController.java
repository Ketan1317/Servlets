package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class homeController {
    @RequestMapping("/home")
    public String home(){
        System.out.println("This HOME URL");
        return "index";
    }

    @RequestMapping("/")
    @ResponseBody
    public String test() {
        return "Spring MVC is working";
    }

}
