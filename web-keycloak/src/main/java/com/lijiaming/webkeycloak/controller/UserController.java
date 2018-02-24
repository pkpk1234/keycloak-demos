package com.lijiaming.webkeycloak.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author 李佳明 https://github.com/pkpk1234
 * @date 2018-02-24
 */

@Controller
public class UserController {
    @GetMapping("/commonUsers")
    public ModelAndView commonUsers(Model model) {
        ModelAndView modelAndView = new ModelAndView("users");
        modelAndView.addObject("title","Common Users");
        return modelAndView;
    }
}
