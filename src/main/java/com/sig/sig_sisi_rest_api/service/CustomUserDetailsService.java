package com.sig.sig_sisi_rest_api.service;

import com.sig.sig_sisi_rest_api.entity.User;
import com.sig.sig_sisi_rest_api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Menganggap username adalah email
        Optional<User> user = userRepository.findByuEmail(username);
        if (!user.isPresent()) {
            throw new UsernameNotFoundException("User not found with email: " + username);
        }

        return new org.springframework.security.core.userdetails.User(user.get().getUEmail(),
                user.get().getUPassword(), new ArrayList<>());
    }
}
