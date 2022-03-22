package APIAutomation.OrgJsonExample;

import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class SimpleJson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JSONObject jsonBody=new JSONObject();
		jsonBody.put("FistName", "Deependra");
		jsonBody.put("LastName", "Singh");
		jsonBody.put("id", "10");
		jsonBody.put("Company", "TCS");
		
        Response response=
        		given().contentType(ContentType.JSON).body(jsonBody.toString())
        		.when().post("http://localhost:3000/TechLead");
		
        System.out.println("Status code==>"+response.statusCode());

	}

}
