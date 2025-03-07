package com.balcohis.api;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class ApiTestRunner {

	@BeforeClass
	public void setUp() {
		System.out.println("Setting up tests...");
		//Comment added at remote repo
	}

	@AfterClass
	public void tearDown() {
		System.out.println("Tearing down tests...");
		// Add any cleanup steps here
	}
}
