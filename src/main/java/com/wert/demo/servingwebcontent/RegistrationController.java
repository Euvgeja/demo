package com.wert.demo.servingwebcontent;

import com.wert.demo.domain.User;
import com.wert.demo.repository.UserRepoFromMemory;
import com.wert.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@Controller
public class RegistrationController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserRepoFromMemory userRepoFromMemory;

    @GetMapping("/registration")
    public String registration() {
        return "registration";
    }

    @PostMapping("/registration")
    public String addUser(User user, Map<String, Object> model) {
        User userFromDb = userRepoFromMemory.findByUserName(user.getUsername());
//      User userFromDb = userRepository.findByUsername(user.getUsername());
        if (userFromDb != null) {
            model.put("massage", "User exist!");
            return "registration";
        }

        user.setActive(true);
//      serRepository.save(user);
        userRepoFromMemory.saveUser(user);

        return "redirect:/login";
    }


}
