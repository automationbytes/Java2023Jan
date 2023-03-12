package com.RestAssuredAPI.examples;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class DeleteReq {
	public static void main(String[] args) {
		RestAssured.baseURI = "http://webservice.toscacloud.com/rest/api";
		Response response = RestAssured.given()
				.contentType(ContentType.JSON)
				.header("Authorization","Bearer 3a29f0a7-6de5-4ccb-9613-ea486552ab59")
				.when()
				.delete("/Coffees_V2/762")
				.then().extract().response();
		
		System.out.println(response.asPrettyString());
	}

}
