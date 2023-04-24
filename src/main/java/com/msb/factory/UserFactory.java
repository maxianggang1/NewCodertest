package com.msb.factory;

import com.msb.pojo.User;

public class UserFactory {
    public User getInstance(){
        return new User(123, "lisa",18,"女");
    }
}
