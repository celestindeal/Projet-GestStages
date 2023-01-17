package com.example.geststages.models;

import jakarta.persistence.*;

@Entity
@Table(name = "spec_entreprise", indexes = {
        @Index(name = "num_spec", columnList = "num_spec")
})
public class SpecEntreprise {
    @EmbeddedId
    private SpecEntrepriseId id;

    @MapsId("numEntreprise")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "num_entreprise", nullable = false)
    private Entreprise numEntreprise;

    @MapsId("numSpec")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "num_spec", nullable = false)
    private Specialite numSpec;

    public Specialite getNumSpec() {
        return numSpec;
    }

    public void setNumSpec(Specialite numSpec) {
        this.numSpec = numSpec;
    }

    public Entreprise getNumEntreprise() {
        return numEntreprise;
    }

    public void setNumEntreprise(Entreprise numEntreprise) {
        this.numEntreprise = numEntreprise;
    }

    public SpecEntrepriseId getId() {
        return id;
    }

    public void setId(SpecEntrepriseId id) {
        this.id = id;
    }
}