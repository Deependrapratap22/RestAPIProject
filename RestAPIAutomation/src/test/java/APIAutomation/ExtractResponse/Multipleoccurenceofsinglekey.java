package APIAutomation.ExtractResponse;

import static io.restassured.RestAssured.given;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Multipleoccurenceofsinglekey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Response response=given().contentType(ContentType.JSON).when().get("http://localhost:3000/TechLead");
		
		System.out.println("Status code==>"+response.getStatusCode());
		//System.out.println("Response==>"+response.asString());
		
		JSONArray array=new JSONArray(response.asString());
		for (int i=0;i<array.length();i++)
		{
			JSONObject ob=array.getJSONObject(i);
			try{
			System.out.println("id=>"+ob.get("age"));
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
		}

	}

}
