package com.leesenleer.BiebApp.controllers;

import com.leesenleer.BiebApp.services.ReadCommunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@Controller
public class ReadCommunityController {
    @Autowired private ReadCommunityService readCommunityService;

<<<<<<< HEAD
    @ResponseBody
    @RequestMapping(value = "/read-community-service", method = RequestMethod.POST)
    public long create(@RequestBody ReadCommunity readCommunity) {
        return readCommunityService.save(readCommunity).getId();
    }

    @ResponseBody
    @RequestMapping(value = "/read-community-service/{id}", method = RequestMethod.PUT)
    public long updateLid(@PathVariable  long id, @RequestBody ReadCommunity readCommunity) {
        return readCommunityService.save(readCommunity).getId();
    }

    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/read-community-service/{id}", method = RequestMethod.DELETE)
    public void updateReadCommunity(@PathVariable long id) {
        readCommunityService.deleteById(id);
    }

    @ResponseBody
    @RequestMapping(value = "/read-community-service", method = RequestMethod.GET)
    public List<ReadCommunity> findAll() {
        return (List<ReadCommunity>) readCommunityService.findAll();
    }

    @ResponseBody
    @RequestMapping(value = "/read-community-service/{id}", method = RequestMethod.GET)
    public Optional<ReadCommunity> getReadCommunity(@PathVariable long id){
        return readCommunityService.findById(id);
    }
=======
>>>>>>> master
}
