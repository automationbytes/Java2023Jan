package com.RestAssuredAPI.examples;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostReq_WithPojo {

	@Test
	public void postreq(){
		PostReqBody postReqBody = new PostReqBody("Delight Coffee with Pojo Implementation", "Pojo Cafeee");
		RestAssured.baseURI = "http://webservice.toscacloud.com/rest/api";
		Response response = RestAssured.given()
				.contentType(ContentType.JSON)
				.header("Authorization","Bearer 3a29f0a7-6de5-4ccb-9613-ea486552ab59")
				.and()
				.body(postReqBody)
				.when()
				.post("/Coffees_V2")
				.then().extract().response();
		
		System.out.println(response.asPrettyString());
		
	}
	
}
