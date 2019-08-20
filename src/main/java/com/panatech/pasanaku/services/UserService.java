package com.panatech.pasanaku.services;

import com.panatech.pasanaku.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private List<User> users;

    public UserService(){
        this.users = new ArrayList<>();
    }

    public User createUser(User user) {
        String id = UUID.randomUUID().toString();
        user.setId(id);
        this.users.add(user);

        return user;
    }

    public List<User> getUsers(){
        return this.users;
    }
}
