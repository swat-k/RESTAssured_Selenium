package AutomationRestAPI;

import org.testng.Assert;
import static org.junit.Assert.assertThat;
import static org.testng.Assert.assertEquals;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class Automationexample {
	
	public String getToken;
	
	@Test
	public void authToken() {
	
	String payload = "{\n" + "  \"username\" : \"admin\",\n" + "  \"password\":\"password123\"\n" +"}";
	
	Response response = given ().
	baseUri("https://restful-booker.herokuapp.com").
	contentType("application/json").
	body (payload).
	when(). post("/auth").
	then().
	log().all().
	extract().response();
	getToken = response.jsonPath().getString("token");
	System.out.println("Token:"+ getToken);
}

	@Test
	public void getBookingIds () {
	String bookingID;
	Response res= given().

	baseUri("https://restful-booker.herokuapp.com").
	contentType("application/json").
	get("/booking").
	then().
	log().all().
	extract().response();
	bookingID = res.jsonPath().getString("bookingid");
	System.out.println("BookingId: " + bookingID);
//	//assert using TestNG
	//Assert.assertEquals(bookingID,"4572");
	}
}
