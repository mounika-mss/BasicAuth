package weddingStepDefinations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class GetBynamee 
{
	
	Response resp;
	ValidatableResponse val;
	
	@When("User Want to Fetch the data by using the URI {string}")
	public void user_want_to_fetch_the_data_by_using_the_uri(String uri)
	{
		resp=RestAssured.get(uri);
	}
	@Then("user want to Verify the statusLine {string}")
	public void user_want_to_verify_the_status_line(String statusLine) 
	{

         val=resp.then()
        		 .assertThat().statusLine(statusLine);
        		
	}
	@Then("User Want to validate the StatusCode {int}")
	public void user_want_to_validate_the_status_code(Integer statusCode) 
	{
              val.assertThat().statusCode(statusCode);

	}


}
