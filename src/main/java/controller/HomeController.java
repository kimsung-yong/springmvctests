package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    public void HomeController(){
        System.out.println("ㅇ");
    }
    @RequestMapping(value="/")
    public String home(){
        return "index";
    }
}
