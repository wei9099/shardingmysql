package com.weiyx.shardingmysql.config;

import com.weiyx.shardingmysql.datasource.DynamicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.Map;

public class DataSorceLoadRunner implements ApplicationRunner {


    @Autowired
    RedisTemplate<String, String> redisTemplate;

    @Override
    public void run(ApplicationArguments args) throws Exception {

    }

    private void setDataSourceInfo(){
        Map<Object, Object> datasource = redisTemplate.opsForHash().entries("datasource");
        DynamicDataSource instance = DynamicDataSource.getInstance();
        instance.setTargetDataSources(datasource);
    }
}
