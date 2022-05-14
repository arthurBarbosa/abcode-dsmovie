package com.abcode.dsmovie.controllers;

import com.abcode.dsmovie.dto.MovieDTO;
import com.abcode.dsmovie.dto.ScoreDTO;
import com.abcode.dsmovie.services.ScoreService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {

    private final ScoreService scoreService;

    public ScoreController(ScoreService scoreService) {
        this.scoreService = scoreService;
    }

    @PutMapping
    public MovieDTO saveScore(@RequestBody ScoreDTO dto) {
        return scoreService.saveScore(dto);
    }

}
