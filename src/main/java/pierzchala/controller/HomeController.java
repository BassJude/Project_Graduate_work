package pierzchala.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String start() {
        return "/home";
    }

    @RequestMapping("/allStudents")
    public String allStudents() { return "/students/allStudents";}
}
