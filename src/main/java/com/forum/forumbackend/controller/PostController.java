package com.forum.forumbackend.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.forum.forumbackend.bean.Post;
import com.forum.forumbackend.result.JsonResult;
import com.forum.forumbackend.service.PostService;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@CrossOrigin
@Controller
public class PostController {

    @Autowired
    PostService postService;

    @ResponseBody
    @GetMapping("/post/getAllPosts")
    public JsonResult getAllPosts()
    {
        List<Post> allPosts = postService.getAllPosts();
        return JsonResult.ok().data("postList", allPosts);
    }
    @ResponseBody
    @RequestMapping("/api/post/{postId}")
    public JsonResult returnPostDetail(@PathVariable("postId")Integer postId)
    {
        Post post = postService.getSpecificPost(postId);
        //更新帖子views
        postService.updateViews(postId);
        return JsonResult.ok().data("post",post);
    }
    @ResponseBody
    @PostMapping("/api/post")
    public JsonResult createPost(@RequestBody JSONObject jsonObject) throws JSONException {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        Integer ownerId= (Integer) jsonObject.get("userId");
        Date date=new Date();
        String activity=simpleDateFormat.format(date);
        String title= (String) jsonObject.get("title");
        String text= (String) jsonObject.get("text");
        return JsonResult.ok();
    }
}
