package com.forum.forumbackend.service;

import com.forum.forumbackend.bean.User;
import com.forum.forumbackend.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public boolean loginJudgement(String userName,String password)
    {
        User user=userMapper.findUserByUserName(userName);
        if(user==null) return false;
        else if(user.getPassword().equals(password))return true;
        else return false;
    }
    public User returnUser(String userName)
    {
        User user=userMapper.findUserByUserName(userName);
        if (user!=null)return user;
        else return null;
    }
}