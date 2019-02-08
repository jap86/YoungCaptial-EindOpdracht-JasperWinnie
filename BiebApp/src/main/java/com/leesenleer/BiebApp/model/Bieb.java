package com.leesenleer.BiebApp.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Bieb {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    private String naam;
    private String beheerder;
    private String adres;
    @OneToMany
    private List<Boek> boeken;

    public int getId() {
        return id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getBeheerder() {
        return beheerder;
    }

    public void setBeheerder(String beheerder) {
        this.beheerder = beheerder;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public List<Boek> getBoeken() {
        return boeken;
    }

    public void setBoeken(List<Boek> boeken) {
        this.boeken = boeken;
    }
}
