package com.cts.hackathon.tourist.model;


public class Attraction {

	private String speech;
	private String displayText;
	private String source;

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

	public Attraction(String speech, String displayText, String source) {
		super();
		this.speech = speech;
		this.displayText = displayText;
		this.source = source;
	}
	

}
