package com.leesenleer.BiebApp.controllers;

import com.leesenleer.BiebApp.model.Boek;
import com.leesenleer.BiebApp.services.BoekService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class BoekController {
    @Autowired private BoekService boekService;

    @GetMapping(value = "/titel/{titel}")
    public List<Boek>vindBoekOpTitel(@PathVariable("titel")String titel){
        return (List<Boek>)this.boekService.findBoeksByTitelContains(titel);
    }

    @GetMapping(value = "/auteur/{auteur}")
    public List<Boek> vindBoekOpAuteur(@PathVariable("auteur")String auteur){
        return (List<Boek>) this.boekService.findBoeksByAuteurContains(auteur);
    }
    @GetMapping(value = "/titelAuteur/{titel}/{auteur}")
    public List<Boek> vindBoekOpTitelEnAuteur(@PathVariable("titel")String titel,@PathVariable("auteur")String auteur){
        return (List<Boek>) this.boekService.findBoeksByTitelContainsAndAuteurContains(titel, auteur);
    }//Geeft Lege Array
}

