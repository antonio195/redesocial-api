package com.antoniocostadossantos.redesocial.controller;

import com.antoniocostadossantos.redesocial.dto.UserDTO;
import com.antoniocostadossantos.redesocial.entity.User;
import com.antoniocostadossantos.redesocial.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/get-all-users")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userService.findAllUsers();
        if (users.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        return ResponseEntity.ok(users);
    }

    @PostMapping("/post-user")
    public ResponseEntity<String> postUser(@RequestBody UserDTO user) {
        Boolean userExist = userService.userExists(user.getEmail());
        if (userExist) {
            return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body("Email já cadastrado.");
        }
        userService.userDTOtoUser(user);
        return ResponseEntity.status(HttpStatus.OK).body("Usuário cadastrado com sucesso.");
    }

}
