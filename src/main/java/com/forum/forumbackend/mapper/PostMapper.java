package com.forum.forumbackend.mapper;

import com.forum.forumbackend.bean.Post;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface PostMapper {
    //select
    List<Post> findAllPosts();
    Post findPostById(Integer postId);
    //create
    void createPost(Integer ownerId,String activity,String title,String text);
    void updateViews(Integer postId);
}
