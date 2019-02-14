package com.leesenleer.BiebApp.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Bieb {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    private String biebNaam;
    private String locatie;
    private String beheerder;

    @OneToMany
    private List<Boek> boeken;

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

    public String getLocatie() {
        return locatie;
    }

    public void setLocatie(String locatie) {
        this.locatie = locatie;
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
                ", locatie='" + locatie + '\'' +
                ", beheerder='" + beheerder + '\'' +
                ", boeken=" + boeken +
                '}';
    }
}

