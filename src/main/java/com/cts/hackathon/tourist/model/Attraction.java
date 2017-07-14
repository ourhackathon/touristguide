package com.cts.hackathon.tourist.model;

import org.json.simple.JSONObject;

public class Attraction {

	private String speech;
	private String displayText;
	private String source;	
	private JSONObject data;

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

	public Attraction(String speech, String displayText, JSONObject a) {
		super();
		this.speech = speech;
		this.displayText = displayText;
//		this.source = source;
		this.data = a;
	}
	

}
