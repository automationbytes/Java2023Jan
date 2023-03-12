package com.RestAssuredAPI.examples;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

public class firstGetRequest {

	@Test
	public void getRequest() {
		
		RestAssured.baseURI = "http://webservice.toscacloud.com/rest/api";
		Response response = RestAssured.given()
				.contentType(ContentType.JSON)
				.header("Authorization","Bearer 3a29f0a7-6de5-4ccb-9613-ea486552ab59")
				.when()
				.get("/Coffees_V2/762")
				.then().extract().response();
		
		System.out.println(response.asPrettyString());
		
//		RestAssured.given()
//		.contentType(ContentType.JSON)
//		.header("Authorization","Bearer 3a29f0a7-6de5-4ccb-9613-ea486552ab59")
//		.when()
//		.get("/Coffees_V2/762")
//		.then()
//		.assertThat()
//		.statusCode(200)
//		.body("Id", equalTo(30))
//		.body("Name", containsString("CoffeeIndia"));
		
	}
	
}
