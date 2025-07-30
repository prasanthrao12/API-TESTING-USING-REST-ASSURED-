package demo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

import javax.print.DocFlavor.STRING;

import org.json.simple.JSONObject;
public class SecondTest {
  
	/*
	 *  ====GET METHOD====
	 */
  @Test
	public void GETTest1() {
		 RestAssured.baseURI="https://reqres.in/";
		 
		  Response response =RestAssured.given().
				 header("x-api-key","reqres-free-v1").
				 get("api/users?delay=3");	         
	     System.out.println(response.getStatusLine());
	     System.out.println(response.getStatusCode());
	     System.out.println(response.getBody().asPrettyString());
	     
	
	}
	
    /*
     * ==== POST METHOD====
     */
	
	
	public void PostTest()
{
		Map<String, String> req = new HashMap<String,String>();
		
		req.put("name", "prasanth");
		req.put("job", "Engineer");
		
		 RestAssured.baseURI="https://reqres.in";
		 JSONObject request=new JSONObject();
		
				 given().
				      header("x-api-key","reqres-free-v1").
				      header("Content-Type","application/json").
				      body(req).
				 when().
				      post("/api/users").
				 then().
				      statusCode(201).log().all();
		
		
}
	
	/*
	 *   ====PUT METHOD====
	 */
	@Test
	public void PutTest() {
		Map<String, String> req = new HashMap<String,String>();
		
				req.put("name", "prasanth");
				req.put("job", "Engineer");
				
				
			
		
		RestAssured.baseURI="https://reqres.in/";
		
		JSONObject json=new JSONObject();
		
		
		given().
		     header("x-api-key","reqres-free-v1").header("Content-Type","application/json").
		     body(req).
	     when().put("api/users/2").then().statusCode(200).log().all();
	}
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
