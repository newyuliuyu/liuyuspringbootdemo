package com.liuyu.user;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LiuyuUserApplicationTests {

	@Autowired
	private ApplicationContext context;
	@Test
	public void contextLoads() throws Exception{
//		S s = (S)context.getBean("mys");
		System.out.println();
	}





}
