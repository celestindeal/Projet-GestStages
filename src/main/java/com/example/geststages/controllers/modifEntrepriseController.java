package com.example.geststages.controllers;

import com.example.geststages.models.Entreprise;
import com.example.geststages.services.EntrepriseService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class modifEntrepriseController {
    private final EntrepriseService entrepriseService;

    public modifEntrepriseController(EntrepriseService entrepriseService) {
        this.entrepriseService = entrepriseService;
    }

    @GetMapping("/modifEntreprise/{id}")
    public String entreprise(ModelMap model, @PathVariable int id) {
        System.out.println("id = " + id);
        Entreprise entreprise = entrepriseService.get(id);

        model.addAttribute("entreprise", entreprise);
        return "modifEntreprise";
    }

    @PostMapping("/modifEntreprise")
    public String greetingSubmit(@ModelAttribute Entreprise entreprise, Model model) {
        model.addAttribute("entreprise", entreprise);
        System.out.println("entreprise = " + entreprise);

        List<Entreprise> entreprises = entrepriseService.getAll();
        model.addAttribute("entreprises", entreprises);
        return "entreprise";
    }
}
