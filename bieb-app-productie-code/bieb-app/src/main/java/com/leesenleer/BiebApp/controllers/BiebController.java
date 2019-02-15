package com.leesenleer.BiebApp.controllers;

import com.leesenleer.BiebApp.services.VoegBiebToeFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import com.leesenleer.BiebApp.model.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")

@Controller
public class BiebController {
    @Autowired private VoegBiebToeFormService voegBiebToeFormService;

    @ResponseBody
    @RequestMapping(value = "/bieb", method = RequestMethod.POST)
    public int create(@RequestBody Bieb bieb) {
        return voegBiebToeFormService.save(bieb).getId();
    }

    @ResponseBody
    @RequestMapping(value = "/bieb/{id}", method = RequestMethod.PUT)
    public int updateBieb(@PathVariable  int id, @RequestBody Bieb bieb) {
        return voegBiebToeFormService.save(bieb).getId();
    }

    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/bieb/{id}", method = RequestMethod.DELETE)
    public void updateBieb(@PathVariable int id) {
        voegBiebToeFormService.deleteById(id);
    }

    @ResponseBody
    @RequestMapping(value = "/bieb", method = RequestMethod.GET)
    public List<Bieb> findAll() {
        return (List<Bieb>) voegBiebToeFormService.findAll();
    }

    @ResponseBody
    @RequestMapping(value = "/bieb/{id}", method = RequestMethod.GET)
    public Bieb getBieb(int id){return voegBiebToeFormService.findById(id).get(); }
}
