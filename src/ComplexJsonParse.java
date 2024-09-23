import files.payLoad;
import io.restassured.path.json.JsonPath;

public class ComplexJsonParse {
	
	
	public static void main(String[] args) {
		
		JsonPath js = new JsonPath(payLoad.CoursePrices());
		
		// Print no of courses retured by API
		int count =js.getInt("courses.size()");
		System.out.println(count);
		
		int totalAmount=js.getInt("dashboard.purchaseAmount");
		System.out.println(totalAmount);
		
		String firstTitleofCourse=js.getString("courses[0].title");
		System.out.println(firstTitleofCourse);
		
		// Print all courses titles
		
		for(int i=0;i<count;i++) {
			String CourseTitles=js.getString("courses["+i+"].title");
			System.out.println(js.getString("courses["+i+"].price").toString());
			System.out.println(CourseTitles);
		}
	}
	

}
