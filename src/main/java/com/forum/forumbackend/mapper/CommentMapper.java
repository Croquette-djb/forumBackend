package com.forum.forumbackend.mapper;

import com.forum.forumbackend.bean.Comment;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;


@Mapper
public interface CommentMapper {
    List<Comment> getCommentByPostId(Integer postId);
}
