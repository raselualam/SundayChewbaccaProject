package upskill.api.restAssured;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static io.restassured.RestAssured.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

import java.io.File;

import org.hamcrest.Matchers;

public class PetStoreRestAssuredActions {
	
	public void createUsername(){
		
		given().
			body(new File(System.getProperty("user.dir") + "/src/test/resource/ApiRequestPayloads/CreateUsernameRequest.json")).
		when().
			header("Content-Type", "application/json").									  //Setting the header
			post("https://petstore.swagger.io/v2/user").								  //Setting the request url
		then().
			log().body().																  //Printing Response body
		and().
			assertThat().statusCode(200).												  //Verify the status code
		and().
			body(matchesJsonSchema(new File(System.getProperty("user.dir") 
				+ "/src/test/resource/ApiResponseSchemas/CreateUsernameResponse.json"))). //Verify the response body using json schema
		and().
			body("type", Matchers.equalTo("unknown"));									  //Verify specific response
	}

	public void UpdateUsername(){
		
		given().
			body(new File(System.getProperty("user.dir") + "/src/test/resource/ApiRequestPayloads/UpdateUsernameRequest.json")).
		when().
			header("Content-Type", "application/json").									  //Setting the header
			put("https://petstore.swagger.io/v2/user/rasel").							  //Setting the request url
		then().
			log().body().																  //Printing Response body
		and().
			assertThat().statusCode(200).												  //Verify the status code
		and().
			body(matchesJsonSchema(new File(System.getProperty("user.dir") 
				+ "/src/test/resource/ApiResponseSchemas/UpdateUsernameResponse.json"))); //Verify the response body using json schema
	}
	
	public void getUsername(){
		
		given().
		when().
			header("Content-Type", "application/json").									  //Setting the header
			get("https://petstore.swagger.io/v2/user/rasel").							  //Setting the request url
		then().
			log().body().																  //Printing Response body
		and().
			assertThat().statusCode(200).												  //Verify the status code
		and().
			body(matchesJsonSchema(new File(System.getProperty("user.dir") 
				+ "/src/test/resource/ApiResponseSchemas/GetUsernameResponse.json")));    //Verify the response body using json schema
	}
	
	public void deleteUsername(){
		
		given().
		when().
			header("Content-Type", "application/json").								  //Setting the header
			delete("https://petstore.swagger.io/v2/user/rasel").					  //Setting the request url
		then().
			log().body().																  //Printing Response body
		and().
			assertThat().statusCode(200).												  //Verify the status code
		and().
			body(matchesJsonSchema(new File(System.getProperty("user.dir") 
				+ "/src/test/resource/ApiResponseSchemas/DeleteUsernameResponse.json"))); //Verify the response body using json schema
	}
}
