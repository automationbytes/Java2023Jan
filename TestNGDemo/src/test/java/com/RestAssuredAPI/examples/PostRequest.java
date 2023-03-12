package com.RestAssuredAPI.examples;

import org.json.JSONObject;

import com.jayway.jsonpath.JsonPath;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

import org.hamcrest.Matcher;

public class PostRequest {

	
	public static void main(String[] args) {
		
	JSONObject jsonobject = new JSONObject();
	jsonobject.put("Description", "Automation Bytes Special Delight Coffee");
	jsonobject.put("Name", "A-Bytes Koffy");
		
	RestAssured.baseURI = "http://webservice.toscacloud.com/rest/api";
	Response response = RestAssured.given()
			.contentType(ContentType.JSON)
			.header("Authorization","Bearer 3a29f0a7-6de5-4ccb-9613-ea486552ab59")
			.and()
			.body(jsonobject.toString())
			.when()
			.post("/Coffees_V2")
			.then().extract().response();
	
	System.out.println(response.asPrettyString());
	
	int Id = JsonPath.read(response.asString(), "$.Id");
	System.out.println(Id);

	
	RestAssured.baseURI = "http://webservice.toscacloud.com/rest/api";
	Response getresponse = RestAssured.given()
			.contentType(ContentType.JSON)
			.header("Authorization","Bearer 3a29f0a7-6de5-4ccb-9613-ea486552ab59")
			.when()
			.get("/Coffees_V2/"+Id)
			.then().extract().response();
	
	System.out.println(getresponse.asPrettyString());
	
	String Name = JsonPath.read(response.asString(), "$..[?(@.Id=="+Id+")].Name").toString();
	System.out.println(Name);
	
	response.then().assertThat().body("Name",not(isEmptyOrNullString()));
	}

	
}
