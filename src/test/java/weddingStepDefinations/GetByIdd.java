package weddingStepDefinations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetByIdd 

{
	
	Response res;
	ValidatableResponse val;
	
	@When("User want to read the data by using URI {string}")
	public void user_want_to_read_the_data_by_using_uri(String string)
	{
	    res=RestAssured.get(string);
	}

	@Then("user want to verify the statusline {string}")
	public void user_want_to_verify_the_statusline(String statusLine)
	{
	 val=res.then()
			  .assertThat().statusLine(statusLine);
	}

	@Then("user want to verify the statusCode {int}")
	public void user_want_to_verify_the_status_code(Integer statusCode)
	{
		val.assertThat().statusCode(statusCode);
	   
	}

}
