package GetRequest;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

public class PostCreatePI {
	@Test
	public void PostID() {
		given().
		  baseUri("https://reqres.in").
		
		  body("{\r\n"
		  		+ "    \"name\": \"roshani\",\r\n"
		  		+ "    \"job\": \"QA\"\r\n"
		  		+ "}").
		header("Content-Type", "application/json"). //mandatory
		when().  
		   post("/api/users").
		then().
		    statusCode(201). //status code 200-OK
		  // log().status().
		  // log().body().
		    log().all(); //log to all print response
		
	}
//post krte vakt header file and body file dalani pdegi
}
