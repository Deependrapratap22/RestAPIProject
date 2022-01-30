package APIAutomation.POJOClassExample;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class simpleAPIusingPOJOClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BasicInformation basicInformation=new BasicInformation();
		basicInformation.setFirstName("richa");
		basicInformation.setLastName("Singh");
		basicInformation.setId("17");
		basicInformation.setCompany("HCL");
		
		Response response=
				
				given().contentType(ContentType.JSON)
				.body(basicInformation).when().post("http://localhost:3000/Engineer");
		
		System.out.println("Status code=>"+response.statusCode());
		
		

	}

}
