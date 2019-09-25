package com.lovers;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.lovers.java.mapper")
@SpringBootApplication
public class LoversApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoversApplication.class, args);
    }

}
