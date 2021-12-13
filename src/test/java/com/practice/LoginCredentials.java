package com.practice;

import org.testng.annotations.Test;

public class LoginCredentials {
	
	@Test
	public void demo1Test() {

		
		String url = System.getProperty("url");
		String browser = System.getProperty("browser");
		String user = System.getProperty("username");
		String pass = System.getProperty("password");
		
		System.out.println(url);
		System.out.println(browser);
		System.out.println(user);
		System.out.println(pass);
		
	}

}
