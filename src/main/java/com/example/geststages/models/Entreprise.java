package com.example.geststages.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "entreprise")
public class Entreprise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "num_entreprise", nullable = false)
    private Integer id;

    @Column(name = "raison_sociale", nullable = false, length = 128)
    private String raisonSociale;

    @Column(name = "nom_contact", length = 128)
    private String nomContact;

    @Column(name = "nom_resp", length = 128)
    private String nomResp;

    @Column(name = "rue_entreprise", length = 128)
    private String rueEntreprise;

    @Column(name = "cp_entreprise")
    private Integer cpEntreprise;

    @Column(name = "ville_entreprise", nullable = false, length = 128)
    private String villeEntreprise;

    @Column(name = "tel_entreprise", length = 32)
    private String telEntreprise;

    @Column(name = "fax_entreprise", length = 32)
    private String faxEntreprise;

    @Column(name = "email", length = 128)
    private String email;

    @Lob
    @Column(name = "observation")
    private String observation;

    @Column(name = "site_entreprise", length = 128)
    private String siteEntreprise;

    @Column(name = "niveau", nullable = false, length = 32)
    private String niveau;

    @Column(name = "en_activite", nullable = false)
    private Boolean enActivite = false;

    @JsonIgnore
    @OneToMany(mappedBy = "numEntreprise")
    private Set<Stage> stages = new LinkedHashSet<>();

    @ManyToMany
    @JoinTable(name = "spec_entreprise",
            joinColumns = @JoinColumn(name = "num_entreprise"),
            inverseJoinColumns = @JoinColumn(name = "num_spec"))
    private Set<Specialite> specialites = new LinkedHashSet<>();

    public Set<Specialite> getSpecialites() {
        return specialites;
    }

    public void setSpecialites(Set<Specialite> specialites) {
        this.specialites = specialites;
    }

    public Set<Stage> getStages() {
        return stages;
    }

    public void setStages(Set<Stage> stages) {
        this.stages = stages;
    }

    public Boolean getEnActivite() {
        return enActivite;
    }

    public void setEnActivite(Boolean enActivite) {
        this.enActivite = enActivite;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public String getSiteEntreprise() {
        return siteEntreprise;
    }

    public void setSiteEntreprise(String siteEntreprise) {
        this.siteEntreprise = siteEntreprise;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFaxEntreprise() {
        return faxEntreprise;
    }

    public void setFaxEntreprise(String faxEntreprise) {
        this.faxEntreprise = faxEntreprise;
    }

    public String getTelEntreprise() {
        return telEntreprise;
    }

    public void setTelEntreprise(String telEntreprise) {
        this.telEntreprise = telEntreprise;
    }

    public String getVilleEntreprise() {
        return villeEntreprise;
    }

    public void setVilleEntreprise(String villeEntreprise) {
        this.villeEntreprise = villeEntreprise;
    }

    public Integer getCpEntreprise() {
        return cpEntreprise;
    }

    public void setCpEntreprise(Integer cpEntreprise) {
        this.cpEntreprise = cpEntreprise;
    }

    public String getRueEntreprise() {
        return rueEntreprise;
    }

    public void setRueEntreprise(String rueEntreprise) {
        this.rueEntreprise = rueEntreprise;
    }

    public String getNomResp() {
        return nomResp;
    }

    public void setNomResp(String nomResp) {
        this.nomResp = nomResp;
    }

    public String getNomContact() {
        return nomContact;
    }

    public void setNomContact(String nomContact) {
        this.nomContact = nomContact;
    }

    public String getRaisonSociale() {
        return raisonSociale;
    }

    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}