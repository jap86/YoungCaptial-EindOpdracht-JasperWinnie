package com.leesenleer.BiebApp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Boek {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String naam;
    String auteur;
    int jaarVanUitgave;
    int aantalBladzijden;
}
