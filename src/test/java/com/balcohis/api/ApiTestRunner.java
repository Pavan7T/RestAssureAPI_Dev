package com.balcohis.api;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class ApiTestRunner {

	@BeforeClass
	public void setUp() {
		System.out.println("Setting up tests...");
		// You can add any global setup steps here
	}

	@AfterClass
	public void tearDown() {
		System.out.println("Tearing down tests...");
		// Add any cleanup steps here
	}
}
