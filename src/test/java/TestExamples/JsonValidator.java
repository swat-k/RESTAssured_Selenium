package TestExamples;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.*;
import org.testng.annotations.Test;

public class JsonValidator {

	@Test
	public void test2()
	{
		
		baseURI="https://reqres.in/api";
		given().
		get("/users?page=2").then().assertThat().body(matchesJsonSchemaInClasspath("schema.json")).statusCode(200);
}
}
