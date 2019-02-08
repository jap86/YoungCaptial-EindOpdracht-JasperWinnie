package com.leesenleer.BiebApp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Bieb {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    int id;
    String naam;
    String beheerder;
    String adres;
    List<Boek> boeken;
}
