package com.company.drycleaning;

import com.company.drycleaning.controller.LoginController;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DrycleaningApplicationTests {

	@Autowired
	LoginController loginController;

	@Test
	public void contextLoads() {
		Assert.assertNull(loginController);
	}

}
