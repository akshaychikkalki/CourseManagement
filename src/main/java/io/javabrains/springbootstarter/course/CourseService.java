package io.javabrains.springbootstarter.course;

import java.util.List;
import java.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class CourseService {
	
	@Autowired
	private CourseRepositry courseRepositry;
      
	
	     public List<Course> getAllCourses(String topicId){
	    	 List <Course> courses = new ArrayList<>();
	    	 courseRepositry.findByTopicId(topicId)
	    	 .forEach(courses::add);
	    	 return courses;
	     }
	     
	    
	     
	     public Object getCourse(String id) {
	    	 return courseRepositry.findById(id);
	    	 
	     }


		public void addCourse(Course course) {
			courseRepositry.save(course);		
		}


		public void updateCourse(Course course) {
			courseRepositry.save(course);
			
		}


		public void deleteCourse(String id) {
			courseRepositry.deleteById(id);
		}


		
}
