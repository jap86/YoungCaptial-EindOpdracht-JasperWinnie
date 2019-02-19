package com.leesenleer.BiebApp.controllers;

import com.leesenleer.BiebApp.services.BiebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import com.leesenleer.BiebApp.model.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")

@Controller
public class BiebController {
    @Autowired private BiebService biebService;

    @ResponseBody
    @RequestMapping(value = "/bieb", method = RequestMethod.POST)
    public int create(@RequestBody Bieb bieb) { return biebService.save(bieb).getId();
    }

    @ResponseBody
    @RequestMapping(value = "/bieb/{id}", method = RequestMethod.PUT)
    public int updateLid(@PathVariable  int id, @RequestBody Bieb bieb) {
        return biebService.save(bieb).getId();
    }

    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/bieb/{id}", method = RequestMethod.DELETE)
    public void updateLid(@PathVariable int id) {
        biebService.deleteById(id);
    }

    @ResponseBody
    @RequestMapping(value = "/bieb", method = RequestMethod.GET)
    public List<Bieb> findAll() {
        return (List<Bieb>) biebService.findAll();
    }

    @ResponseBody
    @RequestMapping(value = "/bieb/{id}", method = RequestMethod.GET)
    public Optional<Bieb> getBieb(@PathVariable int id){
        return biebService.findById(id);
    }
}
