package com.example.learning.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.learning.model.KafkaMessage;

@RestController
public class MessageController {

	@Autowired
	private KafkaTemplate<String,String> kafkaTempte;

	public MessageController(KafkaTemplate<String, String> kafkaTempte) {
		super();
		this.kafkaTempte = kafkaTempte;
	}
	
	@GetMapping("/api/v1")
	public ResponseEntity<String> home() {
		return ResponseEntity.ok("Apache Kafka with Spring Boot");
	}
	@PostMapping("/api/v1/message")
	public ResponseEntity<String> postMessage(@RequestBody KafkaMessage kafkaMessage) {
		kafkaTempte.send("coding", kafkaMessage.getMessage());
		return ResponseEntity.ok(kafkaMessage.getMessage());
	}
}
