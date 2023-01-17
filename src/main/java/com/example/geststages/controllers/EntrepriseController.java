package com.example.geststages.controllers;

import com.example.geststages.models.Entreprise;
import com.example.geststages.services.EntrepriseService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class EntrepriseController {
    private final EntrepriseService entrepriseService;

    public EntrepriseController(EntrepriseService entrepriseService) {
        this.entrepriseService = entrepriseService;
    }

    @GetMapping("/entreprise")
    public String entreprise(ModelMap model) {
        List<Entreprise> entreprises = entrepriseService.getAll();

        model.addAttribute("entreprises", entreprises);
        return "entreprise";
    }
}
