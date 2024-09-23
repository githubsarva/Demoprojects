import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.Assert;

import files.ReusableMethods;
import files.payLoad;


public class Basics {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// validate if Add place API is working as expected
		
		
		// given -- All inputs details
		// when -- submit the API
		// then -- validate the response
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
		String response=given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		//.body(payLoad.AddPlace())
		.body(new String(Files.readAllBytes(Paths.get("C:\\Users\\Dhanyasri\\Desktop\\addplace.json"))))
		.when().post("maps/api/place/add/json")
		.then().log().all().assertThat().statusCode(200).body("scope",equalTo("APP"))
		.header("server", "Apache/2.4.52 (Ubuntu)").extract().response().asString();
		
		System.out.println(response);
		
		JsonPath js = new JsonPath(response);
		String placeId=js.getString("place_id");
		System.out.println(placeId);
		
		
		// Update API
		
		String newAddress="Summer Walk, Africa";
		given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body("{\r\n"
				+ "\"place_id\":\""+placeId+"\",\r\n"
				+ "\"address\":\""+newAddress+"\",\r\n"
				+ "\"key\":\"qaclick123\"\r\n"
				+ "}").
		when().put("maps/api/place/update/json").then().assertThat().log().all().statusCode(200).body("msg", equalTo("Address successfully updated"));
		
		// Get Place API
		
		String getPlaceResponse =given().log().all().queryParam("key", "qaclick123").queryParam("place_id", placeId)
		.when().get("maps/api/place/get/json").then().assertThat().log().all().statusCode(200).extract().response().asString();
		
		//		JsonPath js1= new JsonPath(getPlaceResponse);
		
		JsonPath js1=ReusableMethods.rawtojson(getPlaceResponse);
		String actualAddress = js1.getString("address");
		System.out.println(actualAddress);
		Assert.assertEquals(actualAddress,newAddress
				);
		
	}

}
