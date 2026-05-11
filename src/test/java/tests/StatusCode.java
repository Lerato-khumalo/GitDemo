package tests;

import java.security.AllPermission;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class StatusCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			String apiUrl = "https://reqres.in/api/users/3";
	       

	        Response response = RestAssured
	                .given()
	                	.header("x-api-key", "reqres-free-v1")
	                	.header("x-api-key", apiKey)
	                .when()
	                	.get(apiUrl)
	                .then()
	                	.log.().all()
	        

	        int statusCode = response.getStatusCode();
	        System.out.println("API Status Code: " + statusCode);

	    
		

	}

}
