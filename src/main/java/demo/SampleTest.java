package demo;




import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import io.restassured.response.Response;

public class SampleTest {




	
	
	@Test
	public void Test02() {
      baseURI="https://reqres.in/";
      given().
      get("api/users?page=2").
      then().
      statusCode(200).
      and().
      toString();
      
	}
	
}
