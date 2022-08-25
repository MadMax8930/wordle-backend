package com.brief.ionicBack.service.serviceImpl;

import com.brief.ionicBack.model.User;
import com.brief.ionicBack.repository.UserRepository;
import com.brief.ionicBack.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl {

     @Autowired
    private UserRepository userRepository;

    public List<User> userList() {
        return userRepository.findAll();
    }
}
