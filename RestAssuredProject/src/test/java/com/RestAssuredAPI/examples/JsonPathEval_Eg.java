package com.RestAssuredAPI.examples;

import com.jayway.jsonpath.JsonPath;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class JsonPathEval_Eg {
	public static void main(String[] args) {

		RestAssured.baseURI = "http://webservice.toscacloud.com/rest/api";
		Response response = RestAssured.given()
				.contentType(ContentType.JSON)
				.header("Authorization","Bearer 3a29f0a7-6de5-4ccb-9613-ea486552ab59")
				.when()
				.get("/Coffees_V2")
				.then().extract().response();
		
		System.out.println(response.asPrettyString());
		
		String Id = JsonPath.read(response.asString(), "$..[?(@.Id==150)].Name").toString();
		System.out.println(Id);
		

	}
}


// {
//"Description": "Very cold, let it go",
//"Id": 150,
//"Name": "Freezing Coffee"
//},