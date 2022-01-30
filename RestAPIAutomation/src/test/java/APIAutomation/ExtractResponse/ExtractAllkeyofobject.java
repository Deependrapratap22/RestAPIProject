package APIAutomation.ExtractResponse;

import static io.restassured.RestAssured.given;

import java.util.Set;

import org.json.JSONArray;
import org.json.JSONObject;

import groovyjarjarantlr4.v4.parse.BlockSetTransformer.setAlt_return;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ExtractAllkeyofobject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Response response=given().contentType(ContentType.JSON).when().get("http://localhost:3000/TechLead");
		
		System.out.println("Status code==>"+response.getStatusCode());
		//System.out.println("Response==>"+response.asString());
		
		JSONArray array=new JSONArray(response.asString());
		      JSONObject ob=array.getJSONObject(1);
		     // System.out.println(ob.get("FistName"));
		         Set<String> allkey= ob.keySet();
		         System.out.println("all key"+allkey);
		         
		         for(String s : allkey)
		         {
		        	 System.out.println(s+"=>"+ob.get(s));
		         }

	}

}
