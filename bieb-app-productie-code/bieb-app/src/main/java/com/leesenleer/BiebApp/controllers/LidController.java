package com.leesenleer.BiebApp.controllers;

import com.leesenleer.BiebApp.model.Lid;
import com.leesenleer.BiebApp.services.LidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class LidController {
    @Autowired private LidService lidService;

   @ResponseBody
   @PostMapping (value = "/lid")
    Lid voegLidToe (@RequestBody Lid lid){
//       List<Lid> leden = (List<Lid>) lidService.findByGebruikersnaam();
//       if (leden.size()==0){
//           return lidService.save(lid);
//       }
//       else{
//           return null;
//       }
       return  lidService.save(lid);
   }

   @ResponseBody
    @GetMapping (value = "/lid/{gebruikersnaam}")
    Lid getLid (@PathVariable ("gebruikersnaam") long id, String gebruikersnaam, String wachtwoord){
//       List<Lid> leden = (List<Lid>)this.lidService.findByGebruikersnaam();
//       Lid lid = leden.get(0);
//       if(lid.checkWachtwoord(gebruikersnaam, wachtwoord)){
//           return lid;
//       }
//       else {
//           return null;
//       }
       return lidService.findById(id).get();
   }

   @ResponseBody
    @GetMapping (value = "/lid")
    List<Lid> getLeden (){
       return (List <Lid>)lidService.findAll();
   }

   @ResponseStatus (value = HttpStatus.OK)
    @DeleteMapping (value = "/lid/{id}")
    void verwijderLid (@PathVariable ("id") long id){
       lidService.deleteById(id);
   }
}
