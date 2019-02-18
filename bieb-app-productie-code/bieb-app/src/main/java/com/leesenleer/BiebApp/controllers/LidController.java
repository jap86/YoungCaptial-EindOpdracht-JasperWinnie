package com.leesenleer.BiebApp.controllers;

import com.leesenleer.BiebApp.services.LidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import com.leesenleer.BiebApp.model.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")

@Controller
public class
LidController {
    @Autowired private LidService lidService;

    @ResponseBody
    @RequestMapping(value = "/lid", method = RequestMethod.POST)
    public int create(@RequestBody Lid lid) {
        return lidService.save(lid).getId();
    }

    @ResponseBody
    @RequestMapping(value = "/lid/{id}", method = RequestMethod.PUT)
    public int updateLid(@PathVariable  int id, @RequestBody Lid lid) {
        return lidService.save(lid).getId();
    }

    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/lid/{id}", method = RequestMethod.DELETE)
    public void updateLid(@PathVariable int id) {
        lidService.deleteById(id);
    }

    @ResponseBody
    @RequestMapping(value = "/lid", method = RequestMethod.GET)
    public List<Lid> findAll() {
        return (List<Lid>) lidService.findAll();
    }

    @ResponseBody
    @RequestMapping(value = "/lid/{id}", method = RequestMethod.GET)
    public Optional<Lid> getLid(@PathVariable int id){
        return lidService.findById(id);
    }
}
