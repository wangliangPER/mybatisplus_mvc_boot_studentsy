package com.qf.mybatisplus_mvc_boot_studentsys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.qf.dao")
@SpringBootApplication(scanBasePackages = "com.qf")
public class MybatisplusMvcBootStudentsysApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisplusMvcBootStudentsysApplication.class, args);
    }

}
