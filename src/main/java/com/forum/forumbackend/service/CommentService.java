package com.forum.forumbackend.service;

import com.forum.forumbackend.bean.Comment;
import com.forum.forumbackend.mapper.CommentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    CommentMapper commentMapper;

    public List<Comment> returnCommentList(Integer postId)
    {
        List<Comment> commentList= (List<Comment>) commentMapper.getCommentByPostId(postId);
        return commentList;
    }
}
