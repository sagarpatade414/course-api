package io.springbootquickstart.topic;



import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@RequestMapping("/topics")
	public List<Topic> getAlltopics(){
		
		List<Topic> topic = new ArrayList<>();
		Topic tp = new Topic("Spring", "Spring Framework", "Spring Framework Description");
		Topic tp1 = new Topic("Java", "Java 8", "Java 8 Description");
		Topic tp2 = new Topic("Javascript", "Javascript Framework", "Javascript Description");
		
		topic.add(tp);
		topic.add(tp1);
		topic.add(tp2);
		
		return topic;
	}
}
