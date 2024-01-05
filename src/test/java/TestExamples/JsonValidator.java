package TestExamples;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.*;
import org.testng.annotations.Test;


public class JsonValidator {

	@Test
	public void test1()
	{
		// validating schema for 2 page users
		
		baseURI="https://reqres.in/api";
		given().
		get("/users?page=2").then().assertThat().body(matchesJsonSchemaInClasspath("usersschema.json")).statusCode(200);
}
	@Test
	public void transactiontest()
	{
		
		given().queryParam("CUSTOMER_ID", "68195")
	       .queryParam("PASSWORD", "1234!")
	       .queryParam("Account_No", "1")
	.get("http://demo.guru99.com/V4/sinkministatement.php").then()
		  .assertThat()
		  .body(matchesJsonSchemaInClasspath("transactionschema.json"));
	}
	
	@Test
	public void singleuser()
	
	{
		baseURI="https://reqres.in/api";
		given().get("/users/2").then().assertThat().body(matchesJsonSchemaInClasspath("singleuserschema.json"));
	}
	
	@Test
	public void postuser()
	
	{
		baseURI="https://reqres.in/api";
		given().post("/users").then().assertThat().body(matchesJsonSchemaInClasspath("postuser.json"));
	}
	
	
}
