package com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

    @Controller
    public class UserController {
        @RequestMapping("login")
        public ModelAndView greet(HttpServletRequest request, HttpServletResponse response){
            String str1=request.getParameter("user");
            String str2=request.getParameter("pass");
            User u = new User(str1,str2);
            ModelAndView mv = new ModelAndView();
            mv.setViewName("login");
            mv.addObject("username",str1);
            mv.addObject("password",str2);
            return mv;
        }
    }

