package APIAutomation.ExtractResponse;

import static io.restassured.RestAssured.*;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ExtractSingleKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Response response=given().contentType(ContentType.JSON).when().get("http://localhost:3000/TechLead");
		
		System.out.println("Status code==>"+response.getStatusCode());
		System.out.println("Response==>"+response.asString());
		
		JSONArray js=new JSONArray(response.asString());
		  JSONObject jo=js.getJSONObject(2);
		  JSONArray array=jo.getJSONArray("Address");
		  JSONObject address= array.getJSONObject(0);
		  System.out.println("Landmark"+address.getString("Landmark"));
		  
		  

	}

}
