package com.forum.forumbackend.bean;

import lombok.Data;

@Data
public class Comment {
    private Integer mainId;
    private Integer ownerId;
    private Integer postId;
    private String createTime;
    private String text;
    private Integer likes;
    private Integer dislikes;
    private User author;
}
