package com.example.geststages.services;

import com.example.geststages.models.Entreprise;
import com.example.geststages.repositories.EntrepriseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntrepriseService {
    private final EntrepriseRepository entrepriseRepository;

    public EntrepriseService(EntrepriseRepository entrepriseRepository) {
        this.entrepriseRepository = entrepriseRepository;
    }

    public List<Entreprise> getAll() {
        List<Entreprise> entrepriseList = entrepriseRepository.findAll();

        return entrepriseList;
    }

    public void add(Entreprise entreprise) {
        entrepriseRepository.save(entreprise);
    }

    public void deleteById(Integer id) {
        entrepriseRepository.deleteById(id);
    }
}
