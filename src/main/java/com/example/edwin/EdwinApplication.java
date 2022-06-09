package com.example.edwin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.edwin.mapper")
public class EdwinApplication {

    public static void main(String[] args) {
        SpringApplication.run(EdwinApplication.class, args);
    }

}