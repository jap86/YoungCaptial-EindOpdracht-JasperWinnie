package com.leesenleer.BiebApp.controllers;

import com.leesenleer.BiebApp.model.Boek;
import com.leesenleer.BiebApp.model.ReadCommunity;
import com.leesenleer.BiebApp.services.ReadCommunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@CrossOrigin(origins = "http://localhost:4200")
@Controller
public class ReadCommunityController {
    @Autowired private ReadCommunityService readCommunityService;

    @GetMapping("/boeken}")
    public Set<Boek> getBoeken() {
        return new ReadCommunity().getBoeken();
    }

}
