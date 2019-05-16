package com.huicui.controller;

import com.huicui.server.IUserService;
import com.huicui.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/login")
    @ResponseBody
    public JsonResult login(String userName , String password){
        JsonResult jsonResult = new JsonResult();
        try {
            userService.login(userName,password);
            jsonResult.setCode(1);
        } catch (Exception e) {
            e.printStackTrace();
            jsonResult.setCode(0);
            jsonResult.setMsg("用户名或者密码错误");
        }
        return jsonResult;
    }
}

