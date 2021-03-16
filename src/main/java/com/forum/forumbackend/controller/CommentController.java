package com.forum.forumbackend.controller;

import com.forum.forumbackend.bean.Comment;
import com.forum.forumbackend.result.JsonResult;
import com.forum.forumbackend.service.CommentService;
import org.apache.ibatis.annotations.Param;
import org.codehaus.stax2.ri.evt.CommentEventImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@CrossOrigin
@Controller
public class CommentController {
    @Autowired
    CommentService commentService;

    @ResponseBody
    @GetMapping("/api/comments")
    public JsonResult returnCommentList(@Param("postId")Integer postId)
    {
        List<Comment> commentList=commentService.returnCommentList(postId);
        return JsonResult.ok().data("commentList",commentList);
    }
}
