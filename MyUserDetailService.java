package com.example.demo.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if ("student".equals(username)) {
            return new User("student", "{noop}password", new ArrayList<>()); // password: password
        } else if ("admin".equals(username)) {
            return new User("admin", "{noop}password", new ArrayList<>()); // password: password
        } else {
            throw new UsernameNotFoundException("User not found");
        }
    }
}
