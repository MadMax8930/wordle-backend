package com.brief.ionicBack.controller;

import com.brief.ionicBack.dto.WordDto;
import com.brief.ionicBack.service.serviceImpl.WordServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping(path = "/api")
public class WordController {

    @Autowired
    private WordServiceImpl wordService;

    @PostMapping(path = "/addword")
    public void saveWord(@RequestBody WordDto word)
    {
        wordService.saveWord(word);
    }
}
