package weddingStepDefinations;
import org.json.simple.JSONObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
public class PostWStep
{
	RequestSpecification req;
	Response resp;
	ValidatableResponse val;
	
	@Given("User want to post the data")
	public void user_want_to_post_the_data() 
	
	{
		JSONObject b=new JSONObject();
		
		b.put("capacity",1000);
		 b.put( "foodType", "non veg&sweets ");
		  b.put("id",17);
		 b. put("liquor", "king fisher");
		  b.put("location", "goa");
		  b.put("name","nikshith");
		  
		  b.put("parking", 1390);
		 b.put( "rentPerDay",150);
		  b.put("status", "on going");
		  req=RestAssured.given()
		  .body(b)
		  .contentType(ContentType.JSON);
		     }
	@When("user add the data by using URI {string}")
	public void user_add_the_data_by_using_uri(String uri)
	{
	   resp=req.post(uri);
	}
	@Then("user want to verify the status line {string}")
	public void user_want_to_verify_the_status_line(String statusLine)
	
	{
		val=resp.then()
		.assertThat().statusLine(statusLine);
	    }
	@Then("user want to verify the status code {int}")
	public void user_want_to_verify_the_status_code(Integer statusCode) 
	{
		
				val.assertThat().statusCode(statusCode);
	}
}
