package com.brief.ionicBack.config;

import com.brief.ionicBack.model.ERole;
import com.brief.ionicBack.model.Role;
import com.brief.ionicBack.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class InitDatabase implements CommandLineRunner {

    @Autowired
    private RoleRepository repository;

    @Override
    public void run(String... args) throws Exception {
        /*if (repository.findAll().size() >= 1) {
            Role role = new Role(null, ERole.ROLE_ADMIN);
            repository.save(role);
            System.out.println("if role sauvé");
        }*/
        System.out.println("role sauvé");

    }
}