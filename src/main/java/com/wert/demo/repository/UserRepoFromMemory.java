package com.wert.demo.repository;

import com.wert.demo.domain.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepoFromMemory {

    private List<User> userList = new ArrayList<>();

    public void saveUser(User user) {
        userList.add(user);
    }

    public User findByUserName(String username) {
        User user = null;
        for (User u : userList) {
            if (u.getUsername().equals(username)) {
                user=u;
            }
        }
        return user;
    }


}
