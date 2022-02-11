package com.example.learning.model;

public class KafkaMessage {

	private String message;
	
	public KafkaMessage() {
		super();
	}

	public KafkaMessage(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
