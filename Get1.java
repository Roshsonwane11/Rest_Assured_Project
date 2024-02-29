package GetRequest;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;
//need to check again.
public class Get1 {
	@Test
	public void getID() {
		given().
		baseUri("https://dummy.restapiexample.com/api/v1/employee/1").
		  get("/api/v1/employee/1").
		then().
		  statusCode(200). //status code 200-OK
		  // log().status().
		  // log().body().
		  log().all(); //log to all print response
		
	}
}
