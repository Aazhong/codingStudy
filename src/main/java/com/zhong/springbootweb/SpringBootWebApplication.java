package com.zhong.springbootweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
/**
 * @MapperScan("com.zhong.springbootweb.mapper")
 * 或@MapperScan(basePackages = "com.zhong.springbootweb.mapper")
 * 若不在mapper接口上添加注解@Mapper
 * 可在启动类上添加@MapperScan注解
 * */
/**
 * 开启事务支持，需要在访问数据库的service方法上添加注解@Transactional
 */
@EnableTransactionManagement
public class SpringBootWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWebApplication.class, args);
    }

}
