package com.forum.forumbackend.mapper;

import com.forum.forumbackend.bean.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User findUserByUserName(String userName);
}
