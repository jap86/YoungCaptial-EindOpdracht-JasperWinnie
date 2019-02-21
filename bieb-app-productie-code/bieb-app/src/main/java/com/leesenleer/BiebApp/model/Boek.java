package com.leesenleer.BiebApp.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Boek {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String titel;
    private String auteur;
    private int jaarVanUitgave;
    private int aantalBladzijden;

    @ManyToOne
    private Bieb bieb;


    public Boek() {
    }

    public Boek(String titel, String auteur, int jaarVanUitgave, int aantalBladzijden, Bieb bieb) {
        this.titel = titel;
        this.auteur = auteur;
        this.jaarVanUitgave = jaarVanUitgave;
        this.aantalBladzijden = aantalBladzijden;
        this.bieb = bieb;
    }

    public long getId() {
        return id;
    }

    public String getTitel() {
        return titel;
    }

    public void setBieb (Bieb bieb){this.bieb = bieb;}

    public Bieb getBieb () {return this.bieb;}

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
