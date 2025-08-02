package ApiTest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetMethods {
	
	@Test
	public void LIST_USERS()
	{
		RestAssured.baseURI="https://reqres.in/";
		RestAssured.get("/api/users?page=2");
		
		Response response=RestAssured.
				given().header("x-api-key","reqres-free-v1").get("/api/users?page=2");
	               System.out.println(response.getStatusLine());
	               System.out.println(response.getBody().asPrettyString());
	                                
	
	}
	

}
