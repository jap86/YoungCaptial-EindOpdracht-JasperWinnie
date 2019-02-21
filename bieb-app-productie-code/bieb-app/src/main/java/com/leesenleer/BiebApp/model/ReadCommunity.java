package com.leesenleer.BiebApp.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class ReadCommunity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id=0;

    @OneToMany
    private List<Lid> leden;

    @OneToMany
    private List<Bieb> biebs;

    void voegLidToe(Lid lid){
        leden.add(lid);
    }

    void voegBiebToe(Bieb bieb){
        biebs.add(bieb);
    }

    void verwijderLid(Lid lid){
        leden.remove(lid);
    }

    void verwijderBieb(Bieb bieb){
        biebs.remove(bieb);
    }

    @Override
    public String toString() {
        return "ReadCommunity{" +
                "leden=" + leden +
                ", biebs=" + biebs +
                '}';
    }

    public List<Lid> getLeden() {
        return leden;
    }

    public void setLeden(List<Lid> leden) {
        this.leden = leden;
    }

    public List<Bieb> getBiebs() {
        return biebs;
    }

    public void setBiebs(List<Bieb> biebs) {
        this.biebs = biebs;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}


