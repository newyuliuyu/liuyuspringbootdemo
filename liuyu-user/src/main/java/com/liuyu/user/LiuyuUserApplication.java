package com.liuyu.user;

import com.liuyu.commons.util.IdGenerator;
import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, MybatisAutoConfiguration.class})
@EnableTransactionManagement
//@Import(SConfig.class) //导入的是class文件
//@ImportResource //这个导入的xml文件
//@ServletComponentScan 扫描@WebServlet @WebFilter  @WebListener
public class LiuyuUserApplication {

    @Bean
    public IdGenerator idGenerator() {
        return new IdGenerator(0, 0);
    }

    public static void main(String[] args) {
        SpringApplication.run(LiuyuUserApplication.class, args);
    }
}
