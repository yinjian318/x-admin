package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by YINJIAN on 2018/2/8.
 */
@Controller
@RequestMapping("login")
public class LoginController {
    /**
     * 跳转到登录页面
     * @return
     */
    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login";
    }

    @RequestMapping("/checkLogin")
    @ResponseBody
    public Map<String,Object> checkLogin(String loginAccount, String password, HttpSession session){
        Map<String, Object> map = new HashMap<>();
        if(null != loginAccount && null != password){

        }
        return map;
    }
}
