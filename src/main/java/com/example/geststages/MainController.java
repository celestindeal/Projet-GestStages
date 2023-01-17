package com.example.geststages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class MainController {
    @RequestMapping("/")
    public String home() {
        return "home";
    }

    @RequestMapping("/stagiaire")
    public String stagiaire() {
        return "stagiaire";
    }

    @RequestMapping("/inscription")
    public String inscription() {
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