package com.weiyx.shardingmysql.service.impl;

import com.weiyx.shardingmysql.Dao.UserDao;
import com.weiyx.shardingmysql.common.Response;
import com.weiyx.shardingmysql.entity.User;
import com.weiyx.shardingmysql.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public Response<User> selectById(int id) {
        User user = userDao.selectById(id);
        return Response.success(user);
    }
}
