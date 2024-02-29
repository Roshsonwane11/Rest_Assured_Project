package GetRequest;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class GetValidation {
	
	@Test
	public void getvalidate() {
//use string 	
  String response = given().
		baseUri("https://reqres.in").
		  get("/api/users?page=2").
		then().
		   statusCode(200). //status code 200-OK
		   //log().all(). //log to all print response
         
       extract().response().asString();	//convert string	
  System.out.println(response);
  
  JsonPath js = new JsonPath(response);
  String lastname =js.getString("data.last_name");
  System.out.println("lastmame3 is:" + lastname);
  
	}
}
