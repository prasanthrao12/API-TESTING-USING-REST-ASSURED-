package ApiTest;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DeleteMethods {

	
	/*
	 *   ====DELETE METHOD====
	 */
	@Test
	public void DeleteMethod() {
		
		RestAssured.baseURI="https://reqres.in/";
		
		given().
		     header("x-api-key","reqres-free-v1").
		when().
		    delete("api/users/2").
		then().
		    statusCode(204).log().all();
		
	}
}
