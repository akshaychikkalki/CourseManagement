package io.javabrains.springbootstarter.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepositry extends CrudRepository<Course, String> {
	
	//public List<Course> findByTopicId(String topicId);

	public Iterable<Course> findByTopicId(String topicId);
	
}
