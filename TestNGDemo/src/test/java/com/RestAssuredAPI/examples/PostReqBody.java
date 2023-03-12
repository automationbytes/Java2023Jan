package com.RestAssuredAPI.examples;

public class PostReqBody {

	private String Description;
	//private int Id;
	private String name;
	
	public PostReqBody(String description, String name) {
		this.Description = description;
	//	this.Id = id;
		this.name = name;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
