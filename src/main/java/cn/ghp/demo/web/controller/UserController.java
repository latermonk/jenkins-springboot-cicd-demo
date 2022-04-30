package cn.ghp.demo.web.controller;

import cn.ghp.demo.domain.User;
import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 高汉鹏
 * @date 2021-07-12 17:06
 */
@RestController
public class UserController {

   @GetMapping("/getInfo")
    public  String getInfo( String  name  ,String  password){

       User user = new User(name ,password );

       return JSON.toJSONString(user);
   }




}
