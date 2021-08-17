package com.estudos.workshopmongo.services;

import com.estudos.workshopmongo.domain.User;
import com.estudos.workshopmongo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        List<User> users = repository.findAll();
        return users;
    }
}
