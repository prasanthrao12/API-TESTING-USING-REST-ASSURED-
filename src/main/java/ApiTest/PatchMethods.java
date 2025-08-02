package ApiTest;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PatchMethods {

	/*
	 *  ====PATCH METHOD ====
	 */
	@Test
	public void PatchTest() {
		Map<String, String> req = new HashMap<String,String>();
		
				req.put("name", "prasanth");
				req.put("job", "Engineer");
				
		RestAssured.baseURI="https://reqres.in/";
		
		JSONObject json=new JSONObject();
		
		
		given().
		     header("x-api-key","reqres-free-v1").header("Content-Type","application/json").
		     body(req).
	     when().
	         patch("api/users/2").
	     then().
	         statusCode(200).log().all();
	}

}
