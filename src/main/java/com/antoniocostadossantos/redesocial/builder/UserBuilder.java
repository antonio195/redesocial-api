package com.antoniocostadossantos.redesocial.builder;

import com.antoniocostadossantos.redesocial.entity.User;

public class UserBuilder {

    private User user;

    public UserBuilder() {
        this.user = new User();
    }

    public static UserBuilder create() {
        return new UserBuilder();
    }

    public UserBuilder addName(String name) {
        this.user.setName(name);
        return this;
    }

    public UserBuilder addEmail(String email) {
        this.user.setEmail(email);
        return this;
    }

    public UserBuilder addPassword(String password) {
        this.user.setPassword(password);
        return this;
    }

    public User build() {
        return this.user;
    }

}
