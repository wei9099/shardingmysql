package com.weiyx.shardingmysql;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.weiyx.shardingmysql.Dao")
public class ShardingmysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShardingmysqlApplication.class, args);
	}

}
