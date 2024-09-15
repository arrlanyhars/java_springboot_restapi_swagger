package com.sig.sig_sisi_rest_api.service;

import com.sig.sig_sisi_rest_api.entity.User;
import com.sig.sig_sisi_rest_api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public User saveUser(User user) {
        if (user.getUPassword() != null) {
            user.setUPassword(passwordEncoder.encode(user.getUPassword()));
        }
        return userRepository.save(user);
    }

    public void deleteUser(Long u_id) {
        userRepository.deleteById(u_id);
    }

    public Optional<User> getUserByEmail(String email) {
        return userRepository.findByuEmail(email);
    }
}
