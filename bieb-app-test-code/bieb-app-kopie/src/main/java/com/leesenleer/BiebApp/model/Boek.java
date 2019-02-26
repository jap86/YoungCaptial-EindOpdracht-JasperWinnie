package com.leesenleer.BiebApp.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Boek {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;
    private String titel;
    private String auteur;

    @OneToMany(cascade = CascadeType.ALL)
    @JsonIgnoreProperties("boekExemplaren")
    private List<Bieb>biebs = new ArrayList<>();

    public Boek(BoekExemplaar boekExemplaar, Bieb bieb){
        this.titel = boekExemplaar.getTitel().toLowerCase();
        this.auteur = boekExemplaar.getAuteur().toLowerCase();
        voegBiebToe(bieb);
    }

    public Boek(){}

    public void voegBiebToe(Bieb bieb){

        this.biebs.add(bieb);
    }

    public long getId() {
        return id;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public List<Bieb> getBiebs() {
        return biebs;
    }

    public void setBiebs(List<Bieb> biebs) {
        this.biebs = biebs;
    }

    @Override
    public String toString() {
        return "Boek{" +
                "id=" + id +
                ", titel='" + titel + '\'' +
                ", auteur='" + auteur + '\'' +
                ", biebs=" + biebs +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Boek boek = (Boek) o;
        return id == boek.id &&
                Objects.equals(titel, boek.titel) &&
                Objects.equals(auteur, boek.auteur) &&
                Objects.equals(biebs, boek.biebs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titel, auteur);
    }
}
