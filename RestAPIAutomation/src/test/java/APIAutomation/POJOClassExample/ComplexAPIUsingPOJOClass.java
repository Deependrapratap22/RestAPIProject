package APIAutomation.POJOClassExample;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ComplexAPIUsingPOJOClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		AddressInformation addressInformation = new AddressInformation();
		
		addressInformation.setHouseNumber("65");
		addressInformation.setCity("New Delhi");
		addressInformation.setPincode("110030");
		
		ComplexAPIBasicInformation basicInformation=new ComplexAPIBasicInformation();
		basicInformation.setFirstName("richa");
		basicInformation.setLastName("Singh");
		basicInformation.setId("13");
		basicInformation.setAddress(addressInformation);
		basicInformation.setCompany("HCL");
		
		Response response=
				
				given().contentType(ContentType.JSON)
				.body(basicInformation).when().post("http://localhost:3000/Engineer");
		
		System.out.println("Status code=>"+response.statusCode());
	}

}
