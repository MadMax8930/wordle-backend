package com.brief.ionicBack.service;

import com.brief.ionicBack.model.User;
import com.brief.ionicBack.model.Word;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public interface WordService {
    List<Word> wordList();

}
