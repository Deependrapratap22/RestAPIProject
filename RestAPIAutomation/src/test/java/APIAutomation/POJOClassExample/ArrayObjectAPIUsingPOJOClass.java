package APIAutomation.POJOClassExample;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ArrayObjectAPIUsingPOJOClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AddressInformation[] address=new AddressInformation[2];
		address[0] =new AddressInformation();
		address[0].setHouseNumber("100");
		address[0].setCity("Delhi");
		address[0].setPincode("110030");
		
		address[1] =new AddressInformation();
		address[1].setHouseNumber("201");
		address[1].setCity("jaunpur");
		address[1].setPincode("22146");
		
		ArrayObjectBasicInformation basicInformation=new ArrayObjectBasicInformation();
		basicInformation.setFirstName("richa");
		basicInformation.setLastName("Singh");
		basicInformation.setId("19");
		basicInformation.setAddress(address);
		basicInformation.setCompany("HCL");
		
		Response response=
				
				given().contentType(ContentType.JSON)
				.body(basicInformation).when().post("http://localhost:3000/Engineer");
		
		System.out.println("Status code=>"+response.statusCode());

	}

}
