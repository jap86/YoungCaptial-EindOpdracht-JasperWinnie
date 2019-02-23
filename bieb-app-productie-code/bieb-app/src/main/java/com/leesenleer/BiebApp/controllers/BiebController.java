package com.leesenleer.BiebApp.controllers;

import com.leesenleer.BiebApp.services.BiebService;
import com.leesenleer.BiebApp.services.BoekService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
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


    @ResponseBody
    @RequestMapping(value = "/bieb", method = RequestMethod.POST)
    public long maakBieb(@RequestBody Bieb bieb) {
        return biebService.save(bieb).getId();
    }

    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/bieb/{id}", method = RequestMethod.DELETE)
    public void deleteBieb(@PathVariable long id) {
        biebService.deleteById(id);
    }

    @ResponseBody
    @RequestMapping(value = "/bieb", method = RequestMethod.GET)
    public List<Bieb> findAll() {
        return (List<Bieb>) biebService.findAll();
    }

    @ResponseBody
    @RequestMapping(value = "/bieb/boeken/{id}", method = RequestMethod.GET)
    public List<Boek> getBiebBoeken(@PathVariable("id") long id){
        Bieb bieb = biebService.findById(id).get();
        List<Boek> boekenList= bieb.getBoeken();
        return boekenList;
    }
}
