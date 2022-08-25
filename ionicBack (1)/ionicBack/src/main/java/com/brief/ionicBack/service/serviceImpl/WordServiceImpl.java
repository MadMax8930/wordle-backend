package com.brief.ionicBack.service.serviceImpl;

import com.brief.ionicBack.dto.WordDto;
import com.brief.ionicBack.model.Word;
import com.brief.ionicBack.repository.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class WordServiceImpl {

    @Autowired
    private WordRepository wordRepository;

    public List<Word> wordList() {
        return wordRepository.findAll();
    }

    public void saveWord(WordDto wordDto){
        wordRepository.save(new Word(wordDto.word.toLowerCase()));
    }
}
