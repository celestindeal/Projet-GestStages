package com.example.geststages.models;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "classe")
public class Classe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "num_classe", nullable = false)
    private Integer id;

    @Column(name = "nom_classe", nullable = false, length = 128)
    private String nomClasse;

    @OneToMany(mappedBy = "classe")
    private Set<ProfClasse> profClasses = new LinkedHashSet<>();

    @OneToMany(mappedBy = "numClasse")
    private Set<Etudiant> etudiants = new LinkedHashSet<>();

    public Set<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(Set<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }

    public Set<ProfClasse> getProfClasses() {
        return profClasses;
    }

    public void setProfClasses(Set<ProfClasse> profClasses) {
        this.profClasses = profClasses;
    }

    public String getNomClasse() {
        return nomClasse;
    }

    public void setNomClasse(String nomClasse) {
        this.nomClasse = nomClasse;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}