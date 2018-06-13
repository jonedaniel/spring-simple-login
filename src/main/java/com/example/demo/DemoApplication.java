package com.example.demo;

import com.example.demo.mapper.SalesManMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
@MapperScan("com.example.demo.mapper")
public class DemoApplication {

    @Autowired
    private SalesManMapper salesManMapper;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
