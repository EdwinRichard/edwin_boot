package com.example.edwin.mapper;

import com.example.edwin.bean.UserBean;

public interface UserMapper {

    UserBean getInfo(String name,String password);

}
