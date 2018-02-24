package com.lijiaming.webkeycloak.user.controller;

import com.lijiaming.webkeycloak.user.model.User;
import com.lijiaming.webkeycloak.user.persistens.UserDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author 李佳明 https://github.com/pkpk1234
 * @date 2018-02-24
 */

@Controller
@Slf4j
public class UserController {

    private final UserDao userDao;

    @Autowired
    public UserController(UserDao userDao) {
        this.userDao = userDao;
    }

    @GetMapping("/users")
    public ModelAndView users(boolean isAdmin) {
        ModelAndView modelAndView = new ModelAndView("users");
        if (isAdmin) {
            modelAndView.addObject("title", "Admin Users");
        } else {
            modelAndView.addObject("title", "Common Users");
        }
        List<User> users = this.userDao.findUsersByIsAdmin(isAdmin);
        modelAndView.addObject("users", users);
        return modelAndView;
    }
}
