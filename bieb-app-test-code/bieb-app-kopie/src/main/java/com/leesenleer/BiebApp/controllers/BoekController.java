package com.leesenleer.BiebApp.controllers;

import com.leesenleer.BiebApp.services.BiebService;
import com.leesenleer.BiebApp.services.BoekService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import com.leesenleer.BiebApp.model.*;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import java.nio.file.Path;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class BoekController {
    @Autowired private BoekService boekService;
    @Autowired private BiebService biebService;

    @ResponseBody
    @RequestMapping(value = "bieb/{biebId}/boek", method = RequestMethod.POST)
    public Boek create(@RequestBody Boek boek, @PathVariable("biebId")long biebId) {
    Bieb bieb = this.biebService.findById(biebId).get();
    bieb.voegBoekToe(boek);
        return boekService.save(boek);
    }

    @GetMapping("/boek/{biebId}")
    public List<Boek> getBoekByBiebID(@PathVariable("biebId")long biebId) {

        return boekService.findByBiebId(biebId);
    }

    @ResponseBody
    @RequestMapping(value = "/boek/{id}", method = RequestMethod.PUT)
    public long updateBoek(@PathVariable  long id, @RequestBody Boek boek) {
        return boekService.save(boek).getId();
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/boek/{id}", method = RequestMethod.DELETE)
    public void updateBoek(@PathVariable long id) {
        boekService.deleteById(id);
    }

//    @ResponseBody
//    @RequestMapping(value = "/bieb/{id}", method = RequestMethod.GET)
//    public List<Boek> findAll(@PathVariable long Id) {
//        Bieb bieb = this.biebService.findById(Id).get();
//        return bieb.getBoeken();
//    }

//    @ResponseBody
//    @RequestMapping(value = "/boek/{id}", method = RequestMethod.GET)
//    public Optional<Boek> getBoek(@PathVariable long id){
//        return boekService.findById(id);
//    }
}
