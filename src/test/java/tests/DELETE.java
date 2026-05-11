package tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DELETE {

    public static void main(String[] args) {

        // Set Base URI to delete user with ID 11
        RestAssured.baseURI = "https://reqres.in/api/users/11";

        // Send DELETE request with API key
        Response response = RestAssured
                .given()
                    .header("x-api-key", "reqres-free-v1")
                .when()
                    .delete();

        // Print Status Code
        System.out.println("Status Code: " + response.getStatusCode());
        System.out.println("Commited");
        System.out.println("removed");
        System.out.println("just basic tests");

        // Response body is usually empty for DELETE
        System.out.println("Response Body: " + response.getBody().asString());
    }
}

