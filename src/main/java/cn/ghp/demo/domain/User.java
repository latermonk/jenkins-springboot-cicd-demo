package cn.ghp.demo.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * @author 高汉鹏
 * @date 2021-07-12 17:05
 */
@Getter
@Setter
public class User {


    private String name;
    private String password;


    public User(String name, String password) {

        this.name = name;
        this.password = password;


    }
}
