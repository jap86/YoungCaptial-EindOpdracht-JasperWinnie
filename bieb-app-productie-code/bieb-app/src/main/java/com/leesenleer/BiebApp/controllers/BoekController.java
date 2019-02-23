package com.leesenleer.BiebApp.controllers;

import com.leesenleer.BiebApp.services.BiebService;
import com.leesenleer.BiebApp.services.BoekService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import com.leesenleer.BiebApp.model.*;
import org.springframework.web.bind.annotation.*;
import java.util.List;

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

    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/boek/{id}", method = RequestMethod.DELETE)
    public void updateBoek(@PathVariable long id) {
        boekService.deleteById(id);
    }
}
