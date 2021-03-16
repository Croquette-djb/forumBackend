package com.forum.forumbackend.bean;

import lombok.Data;

@Data
public class Post {
    Integer postId;
    Integer ownerId;
    String activity;
    String title;
    String text;
    Integer likes;
    Integer dislikes;
    Integer views;
    Integer comments;
    User author;
}
