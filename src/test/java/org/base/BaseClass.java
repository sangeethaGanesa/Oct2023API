package org.base;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.specification.RequestSpecification;

public class BaseClass {
	//request Object
	public static RequestSpecification getRequestObject(String baseURI) {
		RestAssured.baseURI=baseURI;
		RequestSpecification requestSpecification = RestAssured.given();
		return requestSpecification;
		
	}
	//Querry Paramater
	public static void attachQuerryParameter(String baseURI,String parameterName,String parameterValue) {
	getRequestObject(baseURI).queryParam(parameterName,parameterValue);
	}
	//Path Paramater
		public static void attachPathParameter(String baseURI,String parameterName,String parameterValue) {
		getRequestObject(baseURI).pathParam(parameterName,parameterValue);
		}
    //Response Object
		public static void getResponseObject(String baseURI, String returnType,String resources) {
			switch(requestType) {
			case"GET":{
				getRequestObject(baseURI).request(Method.GET,resources);
			}
			}
		}
	
}
