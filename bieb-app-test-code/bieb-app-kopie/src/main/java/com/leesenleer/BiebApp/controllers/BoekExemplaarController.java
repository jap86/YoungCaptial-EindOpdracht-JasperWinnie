package com.leesenleer.BiebApp.controllers;

import com.leesenleer.BiebApp.services.BiebService;
import com.leesenleer.BiebApp.services.BoekExemplaarService;
import com.leesenleer.BiebApp.services.BoekService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import com.leesenleer.BiebApp.model.*;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class BoekExemplaarController {
    @Autowired private BoekExemplaarService boekExemplaarService;
    @Autowired private BiebService biebService;
    @Autowired private BoekService boekService;

    @ResponseBody
    @PostMapping(value = "bieb/{biebId}/boek")
    public BoekExemplaar create(@RequestBody BoekExemplaar boekExemplaar, @PathVariable("biebId")long biebId) {
        Bieb bieb = this.biebService.findById(biebId).get();
        bieb.voegBoekExemplaarToe(boekExemplaar);
        Boek boek = new Boek(boekExemplaar, bieb);
        this.boekService.save(boek);
        return boekExemplaarService.save(boekExemplaar);
    }

    @GetMapping("/boeken")
    public List<BoekExemplaar>getBoeken(){
        return (List<BoekExemplaar>)this.boekExemplaarService.findAll();
    }

    @GetMapping("/boek/{biebId}")
    public List<BoekExemplaar> getBoekByBiebID(@PathVariable("biebId")long biebId) {
        Bieb bieb = this.biebService.findById(biebId).get();;
        return bieb.getBoekExemplaren();
    }

    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/boek/{id}", method = RequestMethod.DELETE)
    public void updateBoek(@PathVariable long id) {
        boekExemplaarService.deleteById(id);
    }
}
