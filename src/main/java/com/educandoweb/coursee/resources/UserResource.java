package com.educandoweb.coursee.resources;

import com.educandoweb.coursee.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(null, "Maria", "Maria@gmail.com", "1196452136", "12345");
        return ResponseEntity.ok(u);
    }
}
