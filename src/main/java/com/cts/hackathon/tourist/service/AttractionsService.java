package com.cts.hackathon.tourist.service;

import java.util.ArrayList;
import java.util.List;
import com.cts.hackathon.tourist.model.Attraction;

public class AttractionsService {

	public AttractionsService() {
		// TODO Auto-generated constructor stub
		
	}
		
		public List<Attraction> getAttractions(){
			Attraction a1=null, a2=null;
			Attraction attraction1 = new Attraction("Mysore Palace", "Its a palace of Mysore royale king","", a1);
			Attraction attraction2= new Attraction("Brindavan Garden", "Its a garden built near the KSR dam.","", a2);
//			Object obj= new Object();
//			obj = "k";
//			
			List<Attraction> attractionList = new ArrayList<Attraction>();
			attractionList.add(attraction1);
			attractionList.add(attraction2);
//			attractionList.add((Attraction) obj);
			return attractionList;
		}
	



}
