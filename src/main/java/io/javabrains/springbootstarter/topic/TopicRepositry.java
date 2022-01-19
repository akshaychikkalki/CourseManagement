package io.javabrains.springbootstarter.topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepositry extends CrudRepository<Topic, String> {
	
}
