package com.example.geststages.models;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "professeur")
public class Professeur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "num_prof", nullable = false)
    private Integer id;

    @Column(name = "nom_prof", nullable = false, length = 64)
    private String nomProf;

    @Column(name = "prenom_prof", nullable = false, length = 64)
    private String prenomProf;

    @Column(name = "login", nullable = false, length = 8)
    private String login;

    @Column(name = "mdp", nullable = false, length = 8)
    private String mdp;

    @Column(name = "email", nullable = false, length = 100)
    private String email;

    @OneToMany(mappedBy = "professeur")
    private Set<ProfClasse> profClasses = new LinkedHashSet<>();

    @OneToMany(mappedBy = "numProf")
    private Set<Stage> stages = new LinkedHashSet<>();

    public Set<Stage> getStages() {
        return stages;
    }

    public void setStages(Set<Stage> stages) {
        this.stages = stages;
    }

    public Set<ProfClasse> getProfClasses() {
        return profClasses;
    }

    public void setProfClasses(Set<ProfClasse> profClasses) {
        this.profClasses = profClasses;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPrenomProf() {
        return prenomProf;
    }

    public void setPrenomProf(String prenomProf) {
        this.prenomProf = prenomProf;
    }

    public String getNomProf() {
        return nomProf;
    }

    public void setNomProf(String nomProf) {
        this.nomProf = nomProf;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}