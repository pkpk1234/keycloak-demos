package com.lijiaming.webkeycloak.user;

import com.lijiaming.webkeycloak.user.model.User;
import com.lijiaming.webkeycloak.user.persistens.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author 李佳明 https://github.com/pkpk1234
 * @date 2018-02-24
 */
@Component
public class UserDataInit implements CommandLineRunner{

    private final UserDao userDao;

    @Autowired
    public UserDataInit(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.userDao.save(new User("xiao","wenjie",false));
        this.userDao.save(new User("li","wei",false));
        this.userDao.save(new User("","Josh",false));
        this.userDao.save(new User("li","jiaming",true));
    }
}
