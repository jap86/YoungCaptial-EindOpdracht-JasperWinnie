package com.leesenleer.BiebApp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Boek {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String naam;
    private String auteur;
    private int jaarVanUitgave;
    private int aantalBladzijden;

    public int getId() {
        return id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
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
}
