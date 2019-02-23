package com.leesenleer.BiebApp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Lid {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    private String gebruikersnaam;
    private String wachtwoord;

    public long getId() {
        return id;
    }

    public boolean checkWachtwoord(String gebruikersnaam, String wachtwoord){
        return ((this.gebruikersnaam.equals(gebruikersnaam))&&(this.wachtwoord.equals(wachtwoord)) );
    }

    public String getGebruikersnaam() {
        return gebruikersnaam;
    }

    public void setGebruikersnaam(String gebruikersnaam) {
        this.gebruikersnaam = gebruikersnaam;
    }

    public String getWachtwoord() {
        return wachtwoord;
    }

    public void setWachtwoord(String wachtwoord) {
        this.wachtwoord = wachtwoord;
    }

    @Override
    public String toString() {
        return "Lid{" +
                "id=" + id +
                ", gebruikersnaam='" + gebruikersnaam + '\'' +
                ", wachtwoord='" + wachtwoord + '\'' +
                '}';
    }
}

