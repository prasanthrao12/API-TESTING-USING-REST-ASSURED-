package demo;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class FirstTest {

	public static void main(String[] args) {
		
	      RestAssured.baseURI = "https://reqres.in";

	        // Send GET request and store response
	        Response response = RestAssured
	                .given()
	                .when()
	                .get("/api/users?page=2");

	        // Print response body
	        System.out.println("Response Body:");
	        System.out.println(response.getBody().asPrettyString());

	        // Extract a value using JsonPath
	        JsonPath jsonPath = response.jsonPath();
	        String title = jsonPath.getString("title");
	        System.out.println("\nExtracted Title: " + title);
	    }
		
		
	}
	
	

