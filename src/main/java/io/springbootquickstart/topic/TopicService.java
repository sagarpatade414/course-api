package io.springbootquickstart.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics = new ArrayList<>();
	
	Topic tp = new Topic("spring", "Spring Framework", "Spring Framework Description");
	Topic tp1 = new Topic("java", "Java 8", "Java 8 Description");
	Topic tp2 = new Topic("javascript", "Javascript Framework", "Javascript Description");
	Topic tp3 = new Topic("mysql", "MySQL", "MySQL Database");
	
	public List<Topic> getAllTopics(){
		topics.add(tp);
		topics.add(tp1);
		topics.add(tp2);
		topics.add(tp3);
		return topics;
	}
	
	public Topic getTopic(String id) {
		if(id != null && !id.isEmpty()) {
			
			List<Topic> allTopics = this.getAllTopics();
			
			for(Topic topic :allTopics) {
				if(topic.getId().equals(id)) {
					return topic;
				}
			}
		}
		
		return null;
	}
}
