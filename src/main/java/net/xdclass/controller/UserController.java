package net.xdclass.controller;

import net.xdclass.domain.User;
import net.xdclass.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("save")
    public Object save(){
        User user = new User();
        user.setName("小滴");
        user.setPhone((Math.random() * 100)+"");

        userService.save(user);
        return user;
    }
}
