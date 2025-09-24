package com.example.workshop.config;

import com.example.workshop.entities.User;
import com.example.workshop.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.ArrayList;
import java.util.List;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        List<User> users = new ArrayList<>();
        users.add(new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456"));
        users.add(new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"));

        userRepository.saveAll(users);
    }
}
