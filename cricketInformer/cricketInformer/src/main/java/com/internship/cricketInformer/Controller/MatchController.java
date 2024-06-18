package com.internship.cricketInformer.Controller;

import com.internship.cricketInformer.models.Match;
import com.internship.cricketInformer.service.MatchServices;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/match")
public class MatchController {
    private MatchServices matchService;
    public MatchController(MatchServices matchService){
        this.matchService = matchService;
    }
    @GetMapping("/live")
    public ResponseEntity<List<Match>> getLiveMatches(){
        return new ResponseEntity<>(this.matchService.getLiveMatch(), HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<List<Match>> getAllMatches(){
        return new ResponseEntity<>(this.matchService.getAllMatch(),HttpStatus.OK);
    }
    public ResponseEntity<?> getPointTable()
    {
        return new ResponseEntity<>(this.matchService.getCWC2023PointTable(),HttpStatus.OK);
    }
}
