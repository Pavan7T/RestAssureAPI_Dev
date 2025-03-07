package com.sipl.api;

import io.restassured.response.Response;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;

public class ApiTests {

	@Test
	public void testGetUser() {
		Response response = ApiBase.givenRequest()
				//.pathParam("id", 2)
				.when()
				.get(ApiEndpoints.GET_USER);

		response.then()
		   .statusCode(200)
		   //.body("data.id", equalTo(2))
		   //.body("data.first_name",equalTo("Janet"))
		   .log().all();
	}

	@Test
	public void testCreateUser() {
		String jsonBody = "{ \"first_name\": \"Jane\", \"last_name\": \"Doe\" }";

		Response response = ApiBase.givenRequest().body(jsonBody).when().post(ApiEndpoints.POST_USER);
		response.then().statusCode(201).body("first_name", equalTo("Jane")).log().all();
		String firstName = response.jsonPath().getString("first_name");
		int ID = response.jsonPath().getInt("id");

		System.out.println("First_name: " + firstName);
		System.out.println("ID: " + ID);
	}

	// @Test
	public void testUpdateUser() {
		String jsonBody = "{ \"first_name\": \"Updated Name\" }";

		Response response = ApiBase.givenRequest().pathParam("id", 1).body(jsonBody).when().put(ApiEndpoints.PUT_USER);

		response.then().statusCode(200)
				// .body("data.first_name", equalTo("Updated Name"))
				.log().all();
	}

	// @Test
	public void testDeleteUser() {
		Response response = ApiBase.givenRequest().pathParam("id", 1).when().delete(ApiEndpoints.DELETE_USER);

		response.then().statusCode(204) // No content expected on successful deletion
				.log().all();
	}
}
