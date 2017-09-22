package com.ryoukai.unlinetest.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ryoukai.unlinetest.base.BaseTest;
import com.ryoukai.unlinetest.entity.User;

public class UserDaoTest extends BaseTest {
	
	@Autowired
	private UserDao userDao;

	@Test
	public void testInsertUser() {
		User user = new User();
		user.setUsername("肖俊");
		user.setPassword("123");
		user.setState(1);
		user.setCode("1231231232");
		user.setEmail("1231213213");
		user.setUserType(0);
		userDao.insertUser(user);
	}

}
