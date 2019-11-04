package com.ming.springboot.service;

import org.springframework.stereotype.Service;

/**
 * @author: xiao ming
 * @create:2019-08-2019/8/21 15:05
 */



public class UserServiceImpl implements UserService {


    public UserServiceImpl(){

    }


    @Override
    public void queryUser() {
        System.out.println("----------UserServiceImpl------------");
    }
}
