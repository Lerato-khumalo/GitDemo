package tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class POST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Set Base URI
        RestAssured.baseURI = "https://reqres.in/api/users?page=2";

        // Create JSON data as String
        String requestBody = "{\n" +
                "    \"id\": 7,\n" +
                "    \"email\": \"Lerato.ramos@reqres.in\",\n" +
                "    \"first_name\": \"Lerato\",\n" +
                "    \"last_name\": \"Khumalo\",\n" +
                "    \"avatar\": \"https://reqres.in/img/faces/7-image.jpg\"\n" +
                "}";

        // Send POST request with header and body
        Response response = RestAssured
                .given()
                    .header("Content-Type", "application/json")
                    .header("x-api-key", "reqres-free-v1") // include if your API requires it
                    .body(requestBody)
                .when()
                    .post();

        // Print Status Code
        System.out.println("Status Code: " + response.getStatusCode());

        // Print Response Body
        System.out.println("Response Body:\n" + response.getBody().prettyPrint());

        // Extract fields from response if needed
        String id = response.jsonPath().getString("id");
        String email = response.jsonPath().getString("email");
        System.out.println("ID: " + id);
        System.out.println("Email: " + email);

	

	}

}
