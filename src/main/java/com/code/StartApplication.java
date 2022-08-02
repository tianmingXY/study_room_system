package com.code;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * springboot程序启动类
 */
@SpringBootApplication
public class StartApplication {

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
        PageHelperConfig.showStartInfo(); //控制台显示系统访问路径
    }


}
