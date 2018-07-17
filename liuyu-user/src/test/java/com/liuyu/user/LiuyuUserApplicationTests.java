package com.liuyu.user;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URL;
import java.util.Enumeration;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LiuyuUserApplicationTests {

	@Autowired
	private ApplicationContext context;
	@Test
	public void contextLoads() throws Exception{
		System.out.println();
		Map<String,MyTest> kk = context.getBeansOfType(MyTest.class);
		System.out.println();

		Enumeration<URL> m =  this.getClass().getClassLoader().getResources("/");
		System.out.println();
	}





}
