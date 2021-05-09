package com.wert.demo.service;

import com.wert.demo.domain.User;
import com.wert.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class UserService implements UserDetailsService {

    @Autowired
     private UserRepository userRepo;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

//        if (userDB == null) {
//            throw new UsernameNotFoundException("Unknown user: " + username);
//        }
        return userRepo.findByUsername(username);
    }


}
