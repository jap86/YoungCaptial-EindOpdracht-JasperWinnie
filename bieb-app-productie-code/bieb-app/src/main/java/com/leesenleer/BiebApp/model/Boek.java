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
    private String titel;
    private String auteur;
    private int jaarVanUitgave;
    private int aantalBladzijden;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Boek{" +
                "id=" + id +
                ", titel='" + titel + '\'' +
                ", auteur='" + auteur + '\'' +
                ", jaarVanUitgave=" + jaarVanUitgave +
                ", aantalBladzijden=" + aantalBladzijden +
                '}';
    }
}
