package com.example.geststages.models;

import jakarta.persistence.*;

@Entity
@Table(name = "stage")
public class Stage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "num_stage", nullable = false)
    private Integer id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "num_entreprise")
    private Entreprise numEntreprise;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "num_prof")
    private Professeur numProf;

    public Professeur getNumProf() {
        return numProf;
    }

    public void setNumProf(Professeur numProf) {
        this.numProf = numProf;
    }

    public Entreprise getNumEntreprise() {
        return numEntreprise;
    }

    public void setNumEntreprise(Entreprise numEntreprise) {
        this.numEntreprise = numEntreprise;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    //TODO Reverse Engineering! Migrate other columns to the entity
}