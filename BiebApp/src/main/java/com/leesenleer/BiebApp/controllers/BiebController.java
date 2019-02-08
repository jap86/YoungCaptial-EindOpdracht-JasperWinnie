package com.leesenleer.BiebApp.controllers;

import com.leesenleer.BiebApp.services.BiebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import com.leesenleer.BiebApp.model.*;
import com.leesenleer.BiebApp.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BiebController {
    @Autowired private BiebService biebService;

    //curl -H "Content-Type: application/json" -X POST -d '{"id": 0, "task": "taskTest"}' http://localhost:8080/
    @ResponseBody
    @RequestMapping(value = "/bieb", method = RequestMethod.POST)
    public int create(@RequestBody Bieb bieb) {
        return biebService.save(bieb).getId();
    }

    //curl -H "Content-Type: application/json" -X PUT -d '{"id": 1, "task": "taskTest"}' http://localhost:8080/todo/1
    @ResponseBody
    @RequestMapping(value = "/bieb/{id}", method = RequestMethod.PUT)
    public int updateBieb(@PathVariable  int id, @RequestBody Bieb bieb) {
        return biebService.save(bieb).getId();
    }

    //curl -X DELETE http://localhost:8080/todo/1
    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/bieb/{id}", method = RequestMethod.DELETE)
    public void updateBieb(@PathVariable int id) {
        biebService.deleteById(id);
    }

    //curl  http://localhost:8080/todo
    @ResponseBody
    @RequestMapping(value = "/bieb", method = RequestMethod.GET)
    public List<Bieb> findAll() {
        return (List<Bieb>)biebService.findAll();
    }
}
