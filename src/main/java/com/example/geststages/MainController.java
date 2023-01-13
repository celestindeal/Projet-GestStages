package com.example.geststages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class MainController {
    @RequestMapping("/")
    public String home() {
        return "home";
    }

    @RequestMapping("/stagieire")
    public String products() {
        return "stagieire";
    }

    @RequestMapping("/inscription")
    public String about() {
        return "inscription";
    }

    @RequestMapping("/aide")
    public String aide() {
        return "aide";
    }

    @RequestMapping("/entreprise")
    public String entreprise() {
        return "entreprise";
    }
}