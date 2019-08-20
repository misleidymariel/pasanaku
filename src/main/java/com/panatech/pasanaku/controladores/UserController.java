package com.panatech.pasanaku.controladores;

import com.panatech.pasanaku.models.User;
import com.panatech.pasanaku.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(name = "", produces = "application/json")
    public @ResponseBody List<User> getUsers() {
        return userService.getUsers();
    }

    @PostMapping(name = "", produces = "application/json")
    public @ResponseBody User createUser(@RequestBody User user){
        return userService.createUser(user);
    }
}
