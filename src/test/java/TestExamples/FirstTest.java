package TestExamples;

import org.testng.Assert;
import org.testng.annotations.Test;
import static  io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class FirstTest {
	@Test
	public void test1()
	{
		//to specify the method i.e to get the response (here) from the given api url 
		//and to get and display the response
		
		Response response=get("https://reqres.in/api/users?page=2"); //base url
		System.out.println(response.getStatusCode());
		System.out.println(response.getTime());
		System.out.println(response.getBody().asString());//to get the response body
		System.out.println(response.getStatusLine());
		
		int status=response.getStatusCode();
		Assert.assertEquals(status,200);
	}
	
	@Test
	public void test2()
	{
		
		baseURI="https://reqres.in/api";
		given().
		 get("/users/374").
		then().log().body();
	}
	
	//Example 2
	@Test
	public void testexample1()
	{
		//this will return the response body along with the headers and everything
		given().get("http://demo.guru99.com/V4/sinkministatement.php?CUSTOMER_ID=68195&PASSWORD=1234!&Account_No=1").then().log().all();

		//this will only return the response body
		given().get("http://demo.guru99.com/V4/sinkministatement.php?CUSTOMER_ID=68195&PASSWORD=1234!&Account_No=1").then().log().body();
	}

	@Test
	public void testexample2()
	{
		//Using queryParam method to fetch the same result
		given().queryParam("CUSTOMER_ID", "68195")
		       .queryParam("PASSWORD", "1234!")
		       .queryParam("Account_No", "1")
		.get("http://demo.guru99.com/V4/sinkministatement.php").then().log().body();
	
	}
	
	
	@Test
	public void testegetstatus()
	{
		// to get the response body,status code and print the status code
		given().queryParam("CUSTOMER_ID", "68195")
	       .queryParam("PASSWORD", "134!")
	       .queryParam("Account_No", "1")
	.get("http://demo.guru99.com/V4/sinkministatement.php").then().log().body();
	
		int status =given().queryParam("CUSTOMER_ID", "68195")
		       .queryParam("PASSWORD", "1234!")
		       .queryParam("Account_No", "1")
		.get("http://demo.guru99.com/V4/sinkministatement.php").getStatusCode();
		
		
		System.out.println("The response status is :"+status);
		given().when().get("http://demo.guru99.com/V4/sinkministatement.php?CUSTOMER_ID=68195&PASSWORD=1234!&Account_No=1").then().assertThat().statusCode(200);
	
	}
	
	@Test
	public void testgetuser()
	{
		baseURI="https://reqres.in/api";
		given().get("/users?page=2").then().body("data[0].id",equalTo(7));
	}

}
