package com.example.demo;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    public void save() {
        System.out.println("User saved");
    }
}
