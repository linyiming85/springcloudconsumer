package com.unicom;

import com.unicom.entity.User;
import com.unicom.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringcloudconsumerApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	UserService userService;

	@Test
	public void getUserName(){
		String userName="linym";
		String result=userService.queryUser(userName);
		System.out.println("userinfo:"+result);
	}
}
