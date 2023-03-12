package com.RestAssuredAPI.examples;

import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PutReq {
	public static void main(String[] args) {
		
	JSONObject jsonobject = new JSONObject();
	jsonobject.put("Description", "Dev Special Delight Hot and Cold Coffee");
	jsonobject.put("Name", "Devlabs Koffy");
	jsonobject.put("Id", "761");
	
		
	RestAssured.baseURI = "http://webservice.toscacloud.com/rest/api";
	Response response = RestAssured.given()
			.contentType(ContentType.JSON)
			.header("Authorization","Bearer 3a29f0a7-6de5-4ccb-9613-ea486552ab59")
			.and()
			.body(jsonobject.toString())
			.when()
			.put("/Coffees_V2")
			.then().extract().response();
	
	System.out.println(response.asPrettyString());
	
	}
}
