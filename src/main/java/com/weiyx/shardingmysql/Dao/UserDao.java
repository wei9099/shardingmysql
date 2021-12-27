package com.weiyx.shardingmysql.Dao;

import com.weiyx.shardingmysql.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

    User selectById(Integer id);
}
