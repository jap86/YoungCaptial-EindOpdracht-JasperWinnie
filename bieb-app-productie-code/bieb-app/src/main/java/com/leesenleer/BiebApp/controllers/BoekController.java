package com.leesenleer.BiebApp.controllers;

import com.leesenleer.BiebApp.services.BoekService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import com.leesenleer.BiebApp.model.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")

@Controller
public class BoekController {
    @Autowired private BoekService boekService;

    @ResponseBody
    @RequestMapping(value = "/boek", method = RequestMethod.POST)
    public int create(@RequestBody Boek boek) {
        return boekService.save(boek).getId();
    }

    @ResponseBody
    @RequestMapping(value = "/boek/{id}", method = RequestMethod.PUT)
    public int updateBoek(@PathVariable  int id, @RequestBody Boek boek) {
        return boekService.save(boek).getId();
    }

    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/boek/{id}", method = RequestMethod.DELETE)
    public void updateBoek(@PathVariable int id) {
        boekService.deleteById(id);
    }

    @ResponseBody
    @RequestMapping(value = "/boek", method = RequestMethod.GET)
    public List<Boek> findAll() {
        return (List<Boek>) boekService.findAll();
    }

    @ResponseBody
    @RequestMapping(value = "/boek/{id}", method = RequestMethod.GET)
    public Optional<Boek> getBoek(@PathVariable int id){
        return boekService.findById(id);
    }
}
