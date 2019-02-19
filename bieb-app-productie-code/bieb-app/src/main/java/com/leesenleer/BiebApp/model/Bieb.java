package com.leesenleer.BiebApp.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Bieb {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    private String biebNaam;
    private String straat;
    private int nummer;
    private String plaats;
    private String beheerder;

    @OneToMany
    private List<Boek> boeken;

    public void voegBoekToe(Boek boek){
        boeken.add(boek);
    }

    public void verwijderBoek(Boek boek){
        boeken.remove(boek);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public List<Boek> getBoeken() {
        return boeken;
    }

    public void setBoeken(List<Boek> boeken) {
        this.boeken = boeken;
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
                ", boeken=" + boeken +
                '}';
    }
}

