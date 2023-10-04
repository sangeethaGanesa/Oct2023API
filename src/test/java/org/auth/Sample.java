package org.auth;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Sample {

	public static void main(String[] args) {
		
//		RestAssured.baseURI="https://postman-echo.com";
//		RequestSpecification requestSpecification = RestAssured.given();
//		//To pass the authentication
//		requestSpecification.auth().basic("postman", "password");
//		Response response = requestSpecification.request(Method.GET,"/basic-auth");
//		System.out.println(response.getStatusCode());
//		System.out.println(response.getBody().asPrettyString());
//		

		RestAssured.baseURI="https://api.github.com";
		RequestSpecification requestSpecification = RestAssured.given();
		//To Auth 2.O Authentication
		requestSpecification.auth().oauth2("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");
		Response response = requestSpecification.request(Method.GET,"/users/repos");
		System.out.println(response.getStatusCode());
		System.out.println(response.getBody().asPrettyString());
		System.out.println("Work done with A");
	}

}
