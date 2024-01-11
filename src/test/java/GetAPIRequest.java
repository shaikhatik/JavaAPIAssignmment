import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetAPIRequest {

	@Test
	public void get() {
		RestAssured.baseURI = "https://reqres.in/api/users?page=2"; 
		RequestSpecification httpRequest = RestAssured.given(); 
		
		Response response = httpRequest.request(Method.GET, ""); 
		System.out.println("Status received => " + response.getStatusLine()); 
		System.out.println("Response=>" + response.prettyPrint());
	}
}
