package org.logout;

import static org.testng.Assert.assertEquals;

import org.apache.http.util.Asserts;
import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SampleRestAssured {

	public static void main(String[] args) {
		
		RestAssured.baseURI="https://reqres.in/";
		
		RequestSpecification requestSpecification = RestAssured.given();
		
		requestSpecification.queryParam("page", "2");
		
		Response response = requestSpecification.request(Method.GET,"api/users");
		
		int statusCode = response.getStatusCode();
		
		Assert.assertEquals(200, statusCode);
		
		System.out.println("Response Code is Validate");
		
		String asPrettyString = response.getBody().asPrettyString();
		
		System.out.println(asPrettyString);
		
		
		
		
	    
	    
		
	
		
		
		
		
		
		
		
		
		
	}
}
