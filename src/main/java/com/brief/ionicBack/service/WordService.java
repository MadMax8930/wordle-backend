package com.brief.ionicBack.service;

import com.brief.ionicBack.model.Word;
import com.brief.ionicBack.repository.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public interface WordService {
/*
    @Autowired
    WordRepository repository;*/
    List<Word> wordList();
}
