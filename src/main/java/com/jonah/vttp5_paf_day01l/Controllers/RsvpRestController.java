package com.jonah.vttp5_paf_day01l.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jonah.vttp5_paf_day01l.Models.Rsvp;
import com.jonah.vttp5_paf_day01l.Services.GameService;

@RestController
@RequestMapping("/api")
public class RsvpRestController {
    
    @Autowired
    GameService gameService;

    @GetMapping("/rsvps")
    public ResponseEntity<List<Rsvp>> getAllRsvps(){
        List<Rsvp> allRsvps = gameService.getRsvps();
        return ResponseEntity.ok().body(allRsvps);
    }


    @GetMapping("/rsvp/{name}")
    public ResponseEntity<List<Rsvp>> getRsvpFromName(@PathVariable("name") String name){
        List<Rsvp> possibleRsvp = gameService.getRsvpFromName(name);
        return ResponseEntity.ok().body(possibleRsvp);
    }
}
