package com.cts.hackathon.tourist.service;

import java.util.ArrayList;
import java.util.List;
import com.cts.hackathon.tourist.model.Attraction;
import javax.json.JsonObject;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class AttractionsService {

	public AttractionsService() {
		// TODO Auto-generated constructor stub
		
	}
		
//		public List<Attraction> getAttractions(){
//			JSONObject json=new JSONObject();
//			json.put("Batman", "Spiderman");
//			Attraction attraction1 = new Attraction("Mysore Palace", "Its a palace of Mysore royale king","", json);
//			Attraction attraction2= new Attraction("Brindavan Garden", "Its a garden built near the KSR dam.","", json);
//		    Attraction attraction3=new Attraction("Red fort","Its a historical fort built in Delhi","",json);
//		    Attraction attraction4=new Attraction("India Gate","Its a historical fort built in Delhi","",json);
//		    Attraction attraction5=new Attraction("Kashivishwanath temple","Its a famous temple in varanasi","",json);
//		    Attraction attraction6=new Attraction("Sarnath","Its a religioud place for Baudhha people","",json);
////			Object obj= new Object();
////			obj = "k";
////			
//			List<Attraction> attractionList = new ArrayList<Attraction>();
//			attractionList.add(attraction1);
//			attractionList.add(attraction2);
//			attractionList.add(attraction3);
//			attractionList.add(attraction4);
//			attractionList.add(attraction5);
//			attractionList.add(attraction6);
////			attractionList.add((Attraction) obj);
//			return attractionList;
//		}
//		
		@SuppressWarnings("unchecked")
		public Attraction getAttraction(){
			Attraction a1=null, a2=null, a3=null,a4=null,a5=null,a6=null;
			JSONObject json=new JSONObject();
			//json.put("Batman", "Spiderman");
			JSONArray jarray = new JSONArray();
			
			Attraction attraction1 = new Attraction("Mysore Palace", "Its a palace of Mysore royale king", json, jarray, "dummy-source");
//			Attraction attraction2= new Attraction("Brindavan Garden", "Its a garden built near the KSR dam.","", a2);
//		    Attraction attraction3=new Attraction("Red fort","Its a historical fort built in Delhi","",a3);
//		    Attraction attraction4=new Attraction("India Gate","Its a historical fort built in Delhi","",a4);
//		    Attraction attraction5=new Attraction("Kashivishwanath temple","Its a famous temple in varanasi","",a5);
//		    Attraction attraction6=new Attraction("Sarnath","Its a religioud place for Baudhha people","",a6);
//			
			return attraction1;
		}
	



}
