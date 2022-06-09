package com.example.edwin.service;

import com.example.edwin.bean.UserBean;

public interface UserService {

    UserBean loginIn(String name,String password);

}