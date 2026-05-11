package tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GET {

    public static void main(String[] args) {
        // Set Base URI
        RestAssured.baseURI = "https://reqres.in/api/users/2";

        // Send PUT request with new email and store response
        Response response = RestAssured
                .given()
                	.header("x-api-key", "reqres-free-v1")
                    .header("Content-Type", "application/json")
                    .body("{ \"email\": \"Lerato.Khumalo@Altron.com\" }")
                .when()
                    .put();

        // Print updated email from response
        String updatedEmail = response.jsonPath().getString("email");
        System.out.println("Updated Email: " + updatedEmail);
    }

}
