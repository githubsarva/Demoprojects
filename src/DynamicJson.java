import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import files.payLoad;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
public class DynamicJson {
	
	
	@Test(dataProvider = "BooksData")
	public void Addbook(String isbn,String aisle) {
		
		RestAssured.baseURI="http://216.10.245.166";
		String response = given().header("Content-Type","application/json")
				//.body(payLoad.AddBook("6666","Selenium"))
				.body(payLoad.AddBook(isbn,aisle))
				.when()
		.post("Library/Addbook.php").then().log().all().assertThat().statusCode(200).extract().response().asString();	
		System.out.println(response);
		
	}
	
	@DataProvider(name="BooksData")
	public Object[][] getData() {
		return new Object[][] {{"xyz","2222"},{"asd","3333"},{"qwe","4444"}};
	}

}
