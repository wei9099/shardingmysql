package com.weiyx.shardingmysql.service;

import com.weiyx.shardingmysql.common.Response;
import com.weiyx.shardingmysql.entity.User;
import org.springframework.stereotype.Service;

public interface UserService {

    Response<User> selectById(int id);
}
