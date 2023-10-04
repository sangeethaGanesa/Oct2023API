package org.login;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Sample2 {

	public static void main(String[] args) {
//		RestAssured.baseURI="https://reqres.in";
//		RequestSpecification requestSpecification = RestAssured.given();
//		requestSpecification.queryParam("page", "2");
//		Response response = requestSpecification.request(Method.GET,"api/users");
//		System.out.println(response.getStatusCode());
//		System.out.println(response.getBody().asPrettyString());
		
		//----------------------GET
//	RestAssured.baseURI="https://reqres.in";
//	RequestSpecification requestSpecification = RestAssured.given();
//	requestSpecification.pathParam("id", "2");
//	Response response = requestSpecification.request(Method.GET,"api/users/{id}");
//    System.out.println(response.getStatusCode());
//    System.out.println(response.getBody().asPrettyString());
//	
//		//--------------------------------POST
//     RestAssured.baseURI="https://reqres.in";
//    RequestSpecification requestSpecification=RestAssured.given();
//    // To Attach the Payload
//     JSONObject jsonObject=new JSONObject();;
//     jsonObject.put("name", "Ravi Kumar");
//     jsonObject.put("job", "QA");
//	 requestSpecification.body(jsonObject.toJSONString());
//	Response response = requestSpecification.request(Method.POST,"api/users");
//	System.out.println(response.getStatusCode());
//	System.out.println(response.getBody().asPrettyString());
		
		//-------------------------------------------PUT
//		RestAssured.baseURI="https://reqres.in";
//		RequestSpecification requestSpecification = RestAssured.given();
//		JSONObject jsonObject = new JSONObject();
//		jsonObject.put("name", "Ram");
//		jsonObject.put("job","Developer");
//		
//		requestSpecification.body(jsonObject.toJSONString());
//		
//		requestSpecification.pathParam("id", "2");
//		Response response = requestSpecification.request(Method.PUT,"api/users/{id}");
//		System.out.println(response.getStatusCode());
//		System.out.println(response.getBody().asPrettyString());
		
		
		//-----------------------------DELETE
		
		RestAssured.baseURI="https://reqres.in";
		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.pathParam("id", "2");
		Response response = requestSpecification.request(Method.DELETE,"api/users/{id}");
		System.out.println(response.getStatusCode());
		
		
		
		
	}

}
