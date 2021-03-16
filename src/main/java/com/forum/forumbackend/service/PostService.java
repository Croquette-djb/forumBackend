package com.forum.forumbackend.service;

import com.forum.forumbackend.bean.Post;
import com.forum.forumbackend.mapper.PostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    PostMapper postMapper;

    public List<Post> getAllPosts()
    {
        return postMapper.findAllPosts();
    }
    public Post getSpecificPost(Integer postId)
    {
        return postMapper.findPostById(postId);
    }
    public void updateViews(Integer postId)
    {
        postMapper.updateViews(postId);
    }
    public void createPost(Integer ownerId,String activity,String title,String text)
    {
        postMapper.createPost(ownerId,activity,title,text);
    }
}
