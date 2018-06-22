package com.liuyu.springboot.liuyuweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.freemarker.FreeMarkerAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {FreeMarkerAutoConfiguration.class})
@ComponentScan
public class LiuyuWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(LiuyuWebApplication.class, args);
	}
}
