package io.javabrains.springbootstarter.topic;

import java.util.List;
import java.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class TopicService {
	
	@Autowired
	private TopicRepositry topicrepositry;
      
	
	     public List<Topic> getAllTopics(){
	    	 List <Topic> topics = new ArrayList<>();
	    	 topicrepositry.findAll().forEach(topics::add);
	    	 return topics;
	     }
	     
	     
	     public Object getTopic(String id) {
	    	 return topicrepositry.findById(id);
	    	 
	     }


		public void addTopic(Topic topic) {
			topicrepositry.save(topic);		
		}


		public void updateTopic(String id, Topic topic) {
			topicrepositry.save(topic);	
		}


		public void deleteTopic(String id) {
			topicrepositry.deleteById(id);
		}
}
