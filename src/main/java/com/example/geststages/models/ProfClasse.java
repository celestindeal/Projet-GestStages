package com.example.geststages.models;

import jakarta.persistence.*;

@Entity
@Table(name = "prof_classe")
public class ProfClasse {
    @EmbeddedId
    private ProfClasseId id;
    @MapsId("numClasse")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "num_classe")
    private Classe classe;

    @MapsId("numProf")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "num_prof")
    private Professeur professeur;

    public Professeur getProfesseur() {
        return professeur;
    }

    public void setProfesseur(Professeur professeur) {
        this.professeur = professeur;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public ProfClasseId getId() {
        return id;
    }

    public void setId(ProfClasseId id) {
        this.id = id;
    }

    //TODO Reverse Engineering! Migrate other columns to the entity
}