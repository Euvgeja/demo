package com.wert.demo.servingwebcontent;

import com.wert.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistrationController {
//    @Autowired
//    private UserRepository userRepo;

    @GetMapping("/registration")
    public String registration() {
        return "registration";
    }
}
