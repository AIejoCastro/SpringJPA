package com.example.demo;

import com.example.demo.model.User;
import com.example.demo.services.interfaces.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class H2DemoApplicationTests {

	@Autowired
	private UserService userService;

	@Test
	void contextLoads() {
		User user = new User();
		user.setUsername("testUser");
		user.setPassword("testUser");
		user.setEmail("testUser@email.com");
		user.setName("User");
		user.setLastName("Test");
		userService.saveUser(user);
	}

}
