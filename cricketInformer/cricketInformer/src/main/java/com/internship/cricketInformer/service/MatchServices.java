package com.internship.cricketInformer.service;


import com.internship.cricketInformer.models.Match;
import org.springframework.stereotype.Service;

import java.util.List;



public interface MatchServices {
    List<Match> getAllMatch();
    List<Match> getLiveMatch();
    List<List<String>> getCWC2023PointTable();
}
