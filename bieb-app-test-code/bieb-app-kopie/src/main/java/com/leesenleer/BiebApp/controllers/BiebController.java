package com.leesenleer.BiebApp.controllers;

import com.leesenleer.BiebApp.services.BiebService;
import com.leesenleer.BiebApp.services.BoekExemplaarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import com.leesenleer.BiebApp.model.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class BiebController {
    @Autowired private BiebService biebService;
    @Autowired private BoekExemplaarService boekService;


    @ResponseBody
    @PostMapping(value = "/bieb")
    public long maakBieb(@RequestBody Bieb bieb) {
        return biebService.save(bieb).getId();
    }

    @ResponseStatus(value = HttpStatus.OK)
    @DeleteMapping(value = "/bieb/{id}")
    public void deleteBieb(@PathVariable long id) {
        this.biebService.deleteById(id);
    }

    @ResponseBody
    @GetMapping(value = "/bieb")
    public List<Bieb> findAll() {
        return (List<Bieb>) this.biebService.findAll();
    }

    @ResponseBody
    @GetMapping(value = "/bieb/{id}")
    public Bieb getBieb(@PathVariable("id") long id) {
        return this.biebService.findById(id).get();
    }

    @ResponseBody
    @GetMapping(value = "/bieb/boeken/{id}")
    public List<BoekExemplaar> getBiebBoeken(@PathVariable("id") long id){
        Bieb bieb = biebService.findById(id).get();
        List<BoekExemplaar> boekenList= bieb.getBoekExemplaren();
        return boekenList;
    }
}
