package com.leesenleer.BiebApp.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
public class BoekExemplaar {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;
    private String titel;
    private String auteur;
    private int jaarVanUitgave;
    private int aantalBladzijden;

    @ManyToOne
    @JsonIgnoreProperties("boekExemplaren")
    private Bieb bieb;


    public BoekExemplaar() {
    }

    public BoekExemplaar(String titel, String auteur, int jaarVanUitgave, int aantalBladzijden) {
        this.titel = titel;
        this.auteur = auteur;
        this.jaarVanUitgave = jaarVanUitgave;
        this.aantalBladzijden = aantalBladzijden;
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

    public int getJaarVanUitgave() {
        return jaarVanUitgave;
    }

    public void setJaarVanUitgave(int jaarVanUitgave) {
        this.jaarVanUitgave = jaarVanUitgave;
    }

    public int getAantalBladzijden() {
        return aantalBladzijden;
    }

    public void setAantalBladzijden(int aantalBladzijden) {
        this.aantalBladzijden = aantalBladzijden;
    }

    public Bieb getBieb() {
        return bieb;
    }

    public void setBieb(Bieb bieb) {
        this.bieb = bieb;
    }

    @Override
    public String toString() {
        return "BoekExemplaar{" +
                "id=" + id +
                ", titel='" + titel + '\'' +
                ", auteur='" + auteur + '\'' +
                ", jaarVanUitgave=" + jaarVanUitgave +
                ", aantalBladzijden=" + aantalBladzijden +
                ", bieb=" + bieb +
                '}';
    }
}
