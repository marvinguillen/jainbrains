package io.javabrains.springboot.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;



public interface CourseRepository extends CrudRepository<Course,String> {
    
    public List<Course> FindByTopicId(String topicId);
    
}
