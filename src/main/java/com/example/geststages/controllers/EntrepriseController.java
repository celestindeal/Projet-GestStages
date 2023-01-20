package com.example.geststages.controllers;

import com.example.geststages.models.Entreprise;
import com.example.geststages.services.EntrepriseService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class EntrepriseController {
    private final EntrepriseService entrepriseService;

    public EntrepriseController(EntrepriseService entrepriseService) {
        this.entrepriseService = entrepriseService;
    }

    @GetMapping("/entreprise")
    public String getEntreprise(ModelMap model) {
        List<Entreprise> entreprises = entrepriseService.getAll();

        model.addAttribute("entreprises", entreprises);
        return "entreprise";
    }

    @PostMapping("/entreprise/add")
    public void addEntreprise(ModelMap model, Entreprise entreprise) {
        entrepriseService.add(entreprise);

        model.addAttribute("addEntreprise", "Entreprise bien ajoutée");
    }

    @DeleteMapping("/entreprise/delete/{id}")
    public void deleteEntreprise(ModelMap model, @PathVariable Integer id) {
        entrepriseService.deleteById(id);

        model.addAttribute("deleteEntreprise", "Entreprise bien supprimée");
    }
}
