package GetRequest;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Detele_data {
	public class delete1 {
		@Test
		public void delete() {
			given().
			  baseUri("https://reqres.in").
			
			header("Content-Type", "application/json"). //mandatory
			when().  
			   delete("/api/users/7").
			then().
			    statusCode(204). //status code 200-OK
			  // log().status().
			  // log().body().
			    log().all(); //log to all print response
			
		}
	}
}
