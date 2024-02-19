package GetRequest;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Put_api {
		@Test
		public void Put_update() {
			given().
			  baseUri("https://reqres.in").
			
			  body("{\r\n"
			  		+ "    \"name\": \"morpheus\",\r\n"
			  		+ "    \"job\": \"zion resident\"\r\n"
			  		+ "}").
			header("Content-Type", "application/json"). //mandatory
			when().  
			   put("/api/users/7").
			then().
			    statusCode(200). //status code 200-OK
			  // log().status().
			  // log().body().
			    log().all(); //log to all print response
			
		}
	}


