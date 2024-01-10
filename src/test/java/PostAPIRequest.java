

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PostAPIRequest {
	@Test
	public void post() {
		JSONObject request = new JSONObject();

		request.put("name", "John Doe");
		request.put("job", "Web Developer");

		given().
		header("Content-Type","application/json").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(request.toJSONString()).
		when().
		post("https://reqres.in/api/users").
		then().
		statusCode(201).log().all();
	}
}
