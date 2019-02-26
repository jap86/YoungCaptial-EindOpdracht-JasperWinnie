package com.leesenleer.BiebApp.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
public class ReadCommunity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;

    @OneToMany
    private Set<Boek> boeken = new HashSet<>();

    @OneToMany
    private List<Lid> leden;

    @OneToMany
    private List<Bieb> biebs;

    public void voebBoekToe(Boek boek){
        boeken.add(boek);
    }

    public long getId() {
        return id;
    }

    public Set<Boek> getBoeken() {
        return boeken;
    }

    public void setBoeken(Set<Boek> boeken) {
        this.boeken = boeken;
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

    @Override
    public String toString() {
        return "ReadCommunity{" +
                "id=" + id +
                ", boeken=" + boeken +
                ", leden=" + leden +
                ", biebs=" + biebs +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReadCommunity that = (ReadCommunity) o;
        return id == that.id &&
                Objects.equals(boeken, that.boeken) &&
                Objects.equals(leden, that.leden) &&
                Objects.equals(biebs, that.biebs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, boeken, leden, biebs);
    }
}


