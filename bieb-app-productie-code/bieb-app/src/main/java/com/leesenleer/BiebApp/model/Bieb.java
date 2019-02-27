package com.leesenleer.BiebApp.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Bieb {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;
    private String biebNaam;
    private String straat;
    private int nummer;
    private String plaats;
    private String beheerder;


    @OneToMany (mappedBy = "bieb", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("bieb")
    private List<BoekExemplaar> boekExemplaren = new ArrayList<>();

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Boek> boeken;

    public void voegBoekExemplaarToe(BoekExemplaar boekExemplaar){
        this.boekExemplaren.add(boekExemplaar);
        boekExemplaar.setBieb(this);
    }

    public void verwijderBoek(BoekExemplaar boekExemplaar){
        this.boekExemplaren.remove(boekExemplaar);
    }

    public long getId() {
        return id;
    }

    public String getBiebNaam() {
        return biebNaam;
    }

    public void setBiebNaam(String biebNaam) {
        this.biebNaam = biebNaam;
    }

    public String getStraat() {
        return straat;
    }

    public void setStraat(String straat) {
        this.straat = straat;
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public String getPlaats() {
        return plaats;
    }

    public void setPlaats(String plaats) {
        this.plaats = plaats;
    }

    public String getBeheerder() {
        return beheerder;
    }

    public void setBeheerder(String beheerder) {
        this.beheerder = beheerder;
    }

    public List<BoekExemplaar> getBoekExemplaren() {
        return boekExemplaren;
    }

    public void setBoekExemplaren(List<BoekExemplaar> boekExemplaren) {
        this.boekExemplaren = boekExemplaren;
    }

    @Override
    public String toString() {
        return "Bieb{" +
                "id=" + id +
                ", biebNaam='" + biebNaam + '\'' +
                ", straat='" + straat + '\'' +
                ", nummer=" + nummer +
                ", plaats='" + plaats + '\'' +
                ", beheerder='" + beheerder + '\'' +
                ", boekExemplaren=" + boekExemplaren +
                '}';
    }
}

