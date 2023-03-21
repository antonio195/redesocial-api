package com.antoniocostadossantos.redesocial.service.impl;

import com.antoniocostadossantos.redesocial.dto.UserDTO;
import com.antoniocostadossantos.redesocial.entity.User;
import com.antoniocostadossantos.redesocial.repository.UserRepository;
import com.antoniocostadossantos.redesocial.service.UserService;
import com.antoniocostadossantos.redesocial.util.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultUserService implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Boolean userExists(String email) {
        return userRepository.existsByEmail(email);
    }

    @Override
    public void userDTOtoUser(UserDTO userDTO) {
        UserMapper userMapper = new UserMapper();
        userRepository.save(userMapper.userDTOToUser(userDTO));
    }


}
