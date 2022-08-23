package com.brief.ionicBack.repository;

import com.brief.ionicBack.model.Word;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@CrossOrigin("*")
@Transactional
public interface WordRepository extends JpaRepository<Word, Long> {

}