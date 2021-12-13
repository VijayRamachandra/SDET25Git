package com.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailedTest {
	
	@Test
	public void failedTest() {
		
		System.out.println("Failed Test Case");
		Assert.fail("Failed Test Case Running");
	}

}
