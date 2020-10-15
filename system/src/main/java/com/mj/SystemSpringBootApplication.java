package com.mj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.mj.dao")
@SpringBootApplication
public class SystemSpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(SystemSpringBootApplication.class, args);
    }
}