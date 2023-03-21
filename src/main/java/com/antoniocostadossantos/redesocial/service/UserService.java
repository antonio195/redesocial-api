package com.antoniocostadossantos.redesocial.service;

import com.antoniocostadossantos.redesocial.dto.UserDTO;
import com.antoniocostadossantos.redesocial.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAllUsers();

    Boolean userExists(String email);

    void userDTOtoUser(UserDTO userDTO);

}
