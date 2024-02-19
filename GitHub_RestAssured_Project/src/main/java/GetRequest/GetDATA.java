package GetRequest;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

public class GetDATA {
	//given() : information pass/ url/ mention in header
	//when() : API Related information/ API methods/ Endpoints
	//then(): expect, response, log, assertion/valodate
	
	@Test
	public void getALL() {
		given().
		baseUri("https://reqres.in").
		  get("/api/users?page=2").
		then().
		   statusCode(200). //status code 200-OK
		  // log().status().
		  // log().body().
		
		log().all(); //log to all print response
		
	}
}
