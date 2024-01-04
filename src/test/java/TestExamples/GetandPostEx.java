package TestExamples;

import org.testng.Assert;
import org.testng.annotations.Test;
import static  io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response.*;

public class GetandPostEx
{

	@Test
	public void testGet() {
		baseURI="https://reqres.in/api";
		given().
		 get("/users?page=2").then().body("data.first_name", hasItems("George","Michael"));
}
	
	@Test
	public void testPost()
	{
		JSONObject cont = new JSONObject();
		cont.put("name", "Swathy");
	    cont.put("job", "SDET");
	    //System.out.println(cont.toJSONString());
	    baseURI="https://reqres.in/api";
	    given()
	     .body(cont.toJSONString()).
	     when().
	      post("/users").
	      then().statusCode(201).log().body();
	    
	}
}