package com.panatech.pasanaku.controladores;

import com.panatech.pasanaku.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("users")
public class UserController {

    @GetMapping(name = "", produces = "application/json")
    public @ResponseBody
    User getBook() {
        return new User("test1", 1292837, 456726, "test@gmail.com", "test1");
    }
}
