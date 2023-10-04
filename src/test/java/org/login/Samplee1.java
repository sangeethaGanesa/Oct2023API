package org.login;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Samplee1 {

	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in";
		RequestSpecification requestSpecification=RestAssured.given();
		Roott roott = new Roott("Ravi Kumar","QA");
		requestSpecification.body(roott);
		Response response  = requestSpecification.request(Method.POST,"api/users");
		System.out.println(response.getStatusCode());
		System.out.println(response.get);

	}

}
