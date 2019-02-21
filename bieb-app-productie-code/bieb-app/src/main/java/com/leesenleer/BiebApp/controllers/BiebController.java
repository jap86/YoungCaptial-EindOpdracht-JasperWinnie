package com.leesenleer.BiebApp.controllers;

import com.leesenleer.BiebApp.services.BiebService;
import com.leesenleer.BiebApp.services.BoekService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import com.leesenleer.BiebApp.model.*;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class BiebController {
    @Autowired private BiebService biebService;

    @Autowired private BoekService boekService;


    @RequestMapping(value = "/bieb/boek/{îd}", method = RequestMethod.POST)
    public boolean create(@PathVariable  long id, @RequestBody Boek boek) {
        Optional<Bieb> bieb = biebService.findById(id);
        if (bieb.isPresent()) {
            bieb.get().voegBoekToe(boek);
            biebService.save(bieb.get());
            return true;
        } else
            return false;
    }

    @ResponseBody
    @RequestMapping(value = "/bieb", method = RequestMethod.POST)
    public long create(@RequestBody Bieb bieb) {
        return biebService.save(bieb).getId();
    }

    @ResponseBody
    @RequestMapping(value = "/bieb/{id}", method = RequestMethod.PUT)
    public long updateLid(@PathVariable  long id, @RequestBody Bieb bieb) {
        return biebService.save(bieb).getId();
    }


    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/bieb/{id}", method = RequestMethod.DELETE)
    public void updateLid(@PathVariable long id) {
        biebService.deleteById(id);
    }


    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value="/bieb/{biebId}/boek/{boekId}", method=RequestMethod.PUT)
    public Bieb addBookToBieb(@PathVariable("biebId") long biebId, @PathVariable("boekId") long boekId) {

        Bieb bieb = this.biebService.findById(biebId).get(); // dit moet zo later niet. je moet testen of er 1 in zit
        Boek book = this.boekService.findById(boekId).get();

        bieb.voegBoekToe(book);

        this.biebService.save(bieb);
        this.boekService.save(book);

        return bieb;
    }


    @ResponseBody
    @RequestMapping(value ="bieb/{biebId}", method=RequestMethod.POST)
     public Bieb voegBoekToe (@PathVariable ("biebId") long biebId){
        Bieb bieb = this.biebService.findById(biebId).get();

        return bieb;
    }


    @ResponseBody
    @RequestMapping(value = "/bieb", method = RequestMethod.GET)
    public List<Bieb> findAll() {
        return (List<Bieb>) biebService.findAll();
    }


    @ResponseBody
    @RequestMapping(value = "/bieb/{id}", method = RequestMethod.GET)
    public Optional<Bieb> getBieb(@PathVariable long id){
        return biebService.findById(id);
    }

    @ResponseBody
    @RequestMapping(value = "/bieb/boeken/{id}", method = RequestMethod.GET)
    public List<Boek> getBiebBoeken(@PathVariable("id") long id){
        Bieb bieb = biebService.findById(id).get();
        List<Boek> boekenList= bieb.getBoeken();
        return boekenList;
    }
}
