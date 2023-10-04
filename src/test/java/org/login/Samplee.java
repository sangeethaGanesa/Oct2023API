package org.login;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Samplee {

	//Deserialization Concept using RestAssured
	
	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in";
		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.pathParam("id", "2");
		Response response = requestSpecification.request(Method.GET,"api/users/{id}");
		System.out.println(response.getStatusCode());
		//To perform Deserialization
		Root as = response.as(Root.class);
		System.out.println(as.getData().getId());
		System.out.println(as.getData().getEmail());
		System.out.println(as.getData().getFirst_name());
		System.out.println(as.getData().getLast_name());
		System.out.println(as.getData().getAvatar());
		
		System.out.println(as.getSupport().getUrl());
		System.out.println(as.getSupport().getText());

	}

}
