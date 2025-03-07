package com.sipl.api;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class ApiBase {

	static {
		// Set the Base URI for all requests
		RestAssured.baseURI = "https://reqres.in/"; // Replace with your base API URL
	}

	public static RequestSpecification givenRequest() {
		return RestAssured.given().header("Content-Type", "application/json");
				//.header("Authorization","Bearer <your_token>");
	}
}
