package com.sig.sig_sisi_rest_api.controller;

import com.sig.sig_sisi_rest_api.entity.User;
import com.sig.sig_sisi_rest_api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.sig.sig_sisi_rest_api.dto.LoginRequestDTO;


@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{u_id}")
    public User getUserById(@PathVariable Long u_id) {
        return userService.getUserById(u_id);
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @PutMapping("/{u_id}")
    public User updateUser(@PathVariable Long u_id, @RequestBody User userDetails) {
        User user = userService.getUserById(u_id);
        if (user != null) {
            user.setUFullName(userDetails.getUFullName());
            user.setUEmail(userDetails.getUEmail());
            user.setUStatus(userDetails.getUStatus());
            return userService.saveUser(user);
        }
        return null;
    }

    @DeleteMapping("/{u_id}")
    public void deleteUser(@PathVariable Long u_id) {
        userService.deleteUser(u_id);
    }

    @PostMapping("/login")
    public Map<String, Object> login(@RequestBody LoginRequestDTO loginRequest) {
        String email = loginRequest.getEmail();
        String password = loginRequest.getPassword();
    
        Optional<User> user = userService.getUserByEmail(email);
    
        Map<String, Object> response = new HashMap<>();
        if (user.isPresent() && passwordEncoder.matches(password, user.get().getUPassword())) {
            response.put("status", "success");
            response.put("user", user.get());
        } else {
            response.put("status", "error");
            response.put("message", "Invalid email or password");
        }
    
        return response;
    }
}
