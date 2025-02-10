package org.maven.Api_New;
import static io.restassured.RestAssured.*;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class Restassured {
  private static String baseurl;

public static void main(String[] args) {
	Restassured.baseurl="https://reqres.in/";
	 Response response = given().queryParam("page", 2).when().get("https://reqres.in/?page=2").then().extract().response();
			// System.out.println(response.asPrettyString());
	JsonPath jsonPath = response.jsonPath();
	Object object = jsonPath.get("total");
	System.out.println(object);
	  
	  
	  
	  
	  
	  
}	
}
