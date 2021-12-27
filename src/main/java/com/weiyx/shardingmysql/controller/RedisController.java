package com.weiyx.shardingmysql.controller;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.Connection;

@RestController
public class RedisController {

    @Autowired
    RedisTemplate<String, String> redisTemplate;

    @RequestMapping("/hash/hset")
    public void set(){
        DataSource dataSource = new DruidDataSource();

        redisTemplate.opsForHash().put("default", "default", dataSource);
    }
}
