package com.example.geststages.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ProfClasseId implements Serializable {
    private static final long serialVersionUID = 2078392508094413049L;
    @Column(name = "num_prof", nullable = false)
    private Integer numProf;
    @Column(name = "num_classe", nullable = false)
    private Integer numClasse;

    public Integer getNumClasse() {
        return numClasse;
    }

    public void setNumClasse(Integer numClasse) {
        this.numClasse = numClasse;
    }

    public Integer getNumProf() {
        return numProf;
    }

    public void setNumProf(Integer numProf) {
        this.numProf = numProf;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numProf, numClasse);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ProfClasseId entity = (ProfClasseId) o;
        return Objects.equals(this.numProf, entity.numProf) &&
                Objects.equals(this.numClasse, entity.numClasse);
    }
}