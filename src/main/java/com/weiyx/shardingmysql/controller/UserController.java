package com.weiyx.shardingmysql.controller;

import com.alibaba.fastjson.JSON;
import com.weiyx.shardingmysql.common.Response;
import com.weiyx.shardingmysql.entity.User;
import com.weiyx.shardingmysql.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/selectUserById")
    public Response<User> selectUserById(Integer id){
        return userService.selectById(id);
    }
}
