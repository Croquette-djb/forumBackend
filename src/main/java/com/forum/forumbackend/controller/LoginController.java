package com.forum.forumbackend.controller;

import com.forum.forumbackend.bean.User;
import com.forum.forumbackend.result.JsonResult;
import com.forum.forumbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@CrossOrigin
@Controller
public class LoginController {
    @Autowired
    UserService userService;

    @ResponseBody
    @PostMapping("/api/login")
    public JsonResult userLogin(@RequestBody User loginUser, HttpServletRequest request)
    {

        if(userService.loginJudgement(loginUser.getUserName(),loginUser.getPassword()))
        {
            User user=userService.returnUser(loginUser.getUserName());
            request.getSession().setAttribute("user",user);
            return JsonResult.ok().data("user",user);
        }
        else return JsonResult.fail();
    }

    @ResponseBody
    @GetMapping("/api/user")
    public JsonResult returnUserInfo(HttpServletRequest request)
    {
        User user= (User) request.getSession().getAttribute("user");
        if(user!=null)
        {
            return JsonResult.ok()
                    .data("userInfo",user)
                    .data("isLogin",true);
        }
        else return JsonResult.ok()
                    .data("isLogin",false);
    }
}
