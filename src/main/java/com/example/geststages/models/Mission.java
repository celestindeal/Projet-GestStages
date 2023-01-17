package com.example.geststages.models;

import jakarta.persistence.*;

@Entity
@Table(name = "mission", indexes = {
        @Index(name = "num_stage", columnList = "num_stage")
})
public class Mission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "num_mission", nullable = false)
    private Integer id;

    @Column(name = "libelle", nullable = false, length = 128)
    private String libelle;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "num_stage", nullable = false)
    private Stage numStage;

    public Stage getNumStage() {
        return numStage;
    }

    public void setNumStage(Stage numStage) {
        this.numStage = numStage;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}