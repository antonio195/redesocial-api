package com.antoniocostadossantos.redesocial.util;

import com.antoniocostadossantos.redesocial.builder.UserBuilder;
import com.antoniocostadossantos.redesocial.dto.UserDTO;
import com.antoniocostadossantos.redesocial.entity.User;

public class UserMapper {

    public User userDTOToUser(UserDTO userDTO) {
        User newUser = UserBuilder.create()
                .addName(userDTO.getName())
                .addEmail(userDTO.getEmail())
                .addPassword(userDTO.getPassword())
                .build();
        return newUser;
    }

}
