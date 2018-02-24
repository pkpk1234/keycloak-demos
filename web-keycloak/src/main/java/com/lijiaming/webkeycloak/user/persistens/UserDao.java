package com.lijiaming.webkeycloak.user.persistens;

import com.lijiaming.webkeycloak.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 李佳明 https://github.com/pkpk1234
 * @date 2018-02-24
 */
@Repository
public interface UserDao extends JpaRepository<User,Long> {
    List<User> findUsersByIsAdmin(boolean isAdmin);
}
