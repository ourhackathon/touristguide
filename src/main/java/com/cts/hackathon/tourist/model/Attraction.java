package com.cts.hackathon.tourist.model;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Attraction {

	private String speech;
	private String displayText;	
	private JSONObject data;
	private JSONArray contextOut;
	private String source;	

	public JSONArray getContextOut() {
		return contextOut;
	}

	public void setContextOut(JSONArray contextOut) {
		this.contextOut = contextOut;
	}

	public JSONObject getData() {
		return data;
	}

	public void setData(JSONObject data) {
		this.data = data;
	}

	public Attraction() {}

	public String getSpeech() {
		return speech;
	}

	public void setSpeech(String speech) {
		this.speech = speech;
	}

	public String getDisplayText() {
		return displayText;
	}

	public void setDisplayText(String displayText) {
		this.displayText = displayText;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public Attraction(String speech, String displayText, JSONObject a, JSONArray b, String source) {
		super();
		this.speech = speech;
		this.displayText = displayText;		
		this.data = a;
		this.contextOut = b;
		this.source = source;
	}
	

}
