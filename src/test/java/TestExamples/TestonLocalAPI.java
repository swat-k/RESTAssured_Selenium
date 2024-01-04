package TestExamples;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;

import javax.swing.text.AbstractDocument.Content;


public class TestonLocalAPI {

	@Test
	public void get()
	{
        baseURI="http://localhost:3000/";
//		given()
//		 .get("users").then().statusCode(200).log().body();
		
		given().queryParam("id", 2)
		 .get("users").then().statusCode(200).log().body();
		
	}
	
	
	@Test
	public void post()
	{
		
		 baseURI="http://localhost:3000/";
		 JSONObject cont =new JSONObject();
		 cont.put("name", "Rachel");
		 cont.put("age", 35);
		 
		 given().
		 contentType(ContentType.JSON)
		 .accept(ContentType.JSON).
		  body(cont.toJSONString()).when().
		 post("users").then().statusCode(201).log().all();
	}
	
	@Test
	public void put()
	
	{ 
	baseURI="http://localhost:3000/";
	 JSONObject ob =new JSONObject();
	 ob.put("name", "Ross");
	 ob.put("age", 39);
	 ob.put("id", 4);
	 ob.put("d_id", 1);
		
	 given().
	 contentType(ContentType.JSON)
	 .accept(ContentType.JSON).
	  body(ob.toJSONString()).when().
	 put("users/4").then().statusCode(200).log().all();
	}
	
	
	@Test
	public void patch()
	
	{ 
	baseURI="http://localhost:3000/";
	 JSONObject ob1 =new JSONObject();
	 ob1.put("name", "Arya");
	 ob1.put("age", 32);
	 ob1.put("d_id", 2);
	 
		
	 given().
	 contentType(ContentType.JSON)
	 .accept(ContentType.JSON).
	  body(ob1.toJSONString()).when().
	 patch("users/5").then().statusCode(200).log().all();
	}
	
	@Test
	public void delete()
	
	{ 
	baseURI="http://localhost:3000/";
		when().
	 delete("users/6").then().statusCode(200).log().all();
	}
	
}
