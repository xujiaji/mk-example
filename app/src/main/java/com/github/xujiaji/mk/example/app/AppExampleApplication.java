package com.github.xujiaji.mk.example.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.github.xujiaji.mk.*.mapper")
@ComponentScan("com.github.xujiaji.mk")
public class AppExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppExampleApplication.class, args);
	}

}
