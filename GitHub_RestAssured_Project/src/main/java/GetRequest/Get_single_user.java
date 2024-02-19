package GetRequest;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

@Test
public class Get_single_user {
	public class Get1 {
		@Test
		public void getIrD() {
			given().
			baseUri("https://reqres.in").
			  get("/api/users/7").
			then().
			  statusCode(200). //status code 200-OK
			  // log().status().
			  // log().body().
			  log().all(); //log to all print response
			
		}
	}
}
