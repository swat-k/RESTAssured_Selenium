package TestExamples;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class PutPatchandDelete {
	
	@Test
	public void testPut()
	{
		JSONObject cont = new JSONObject();
		cont.put("name", "Swathy");
	    cont.put("job", "SDET");
	    //System.out.println(cont.toJSONString());
	    baseURI="https://reqres.in/api";
	    given()
	     .body(cont.toJSONString()).
	     when().
	      put("/users/2").
	      then().statusCode(200).log().all();
	    
	}
	
	@Test
	public void testPatch()
	{
		JSONObject cont = new JSONObject();
		cont.put("name", "Swathy");
	    cont.put("job", "SDET");
	    //System.out.println(cont.toJSONString());
	    baseURI="https://reqres.in/api";
	    given()
	     .body(cont.toJSONString()).
	     when().
	      patch("/users/2").
	      then().statusCode(200).log().all();
	    
	}
	
	@Test
	public void testDelete()
	{
		baseURI="https://reqres.in/api";
		
		when().delete("/users/2").then().statusCode(204).log().all();
	}

}
