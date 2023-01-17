package com.example.geststages.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class SpecEntrepriseId implements Serializable {
    private static final long serialVersionUID = 266885745793439409L;
    @Column(name = "num_entreprise", nullable = false)
    private Integer numEntreprise;
    @Column(name = "num_spec", nullable = false)
    private Integer numSpec;

    public Integer getNumSpec() {
        return numSpec;
    }

    public void setNumSpec(Integer numSpec) {
        this.numSpec = numSpec;
    }

    public Integer getNumEntreprise() {
        return numEntreprise;
    }

    public void setNumEntreprise(Integer numEntreprise) {
        this.numEntreprise = numEntreprise;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numEntreprise, numSpec);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        SpecEntrepriseId entity = (SpecEntrepriseId) o;
        return Objects.equals(this.numEntreprise, entity.numEntreprise) &&
                Objects.equals(this.numSpec, entity.numSpec);
    }
}