package com.example.learning.listener;

import org.springframework.stereotype.Component;
import org.springframework.kafka.annotation.KafkaListener; 

@Component
public class KafkaTopicListener {

	
	@KafkaListener(topics = "coding", groupId = "IT")
	void kafkaListener(String topicMessage) {
		System.out.println("Kafka Topic Listener received message " + topicMessage + " for the topic coding");
	}
}
