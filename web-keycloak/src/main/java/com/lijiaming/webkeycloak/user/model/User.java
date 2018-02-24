package com.lijiaming.webkeycloak.user.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author 李佳明 https://github.com/pkpk1234
 * @date 2018-02-24
 */
@Entity
@Data
@EqualsAndHashCode(of={"id"})
@ToString
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue
    private Long id;

    private String firstName;

    private String lastName;

    private Boolean isAdmin;

    public User(String firstName, String lastName, Boolean isAdmin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isAdmin = isAdmin;
    }
}
