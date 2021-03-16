package com.forum.forumbackend.bean;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class User {
    private Integer userId;
    private String userName;
    private String password;
    private String nickname;
    private char avatar;

    public User(String nickname,char avatar)
    {
        this.nickname=nickname;
        this.avatar=avatar;
    }

    public User(){}
}
