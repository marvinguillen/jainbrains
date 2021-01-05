package io.javabrains.springboot.course;
import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;
/*  private List<Course> courses= new ArrayList<>(Arrays.asList(
            new Course("Spring","Spring Framework","Spring F Descrip"),
            new Course("Java","Java Framework","Java F Descrip"),
            new Course("JavaScript","JavaScript Framework","JavaScript F Descrip"),
            new Course("Eclipse","Eclipse Framework","Eclipse F Descrip")
    ));*/
    public List<Course> getAllCourses(String topicId){
       // return topics;
       List<Course> courses =new ArrayList<>();
       courseRepository.FindByTopicId(topicId).forEach(courses::add);
       //courseRepository.;

       return courses;

    }
    public Course getCourse(String id)
    {
    //   return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
       return courseRepository.findById(id).get();
    }
	public void addCourse(Course course) {
      //  topics.add(topic);
      courseRepository.save(course);
	}
	public void updateCourse(Course course) {
        /*for(int i=0; i< topics.size();i++){
            Topic t =topics.get(i);
            if(t.getId().equals(id)){
                topics.set(i,topic);
                return;
            }
        }*/
        courseRepository.save(course);
	}
	public void  deleteCourse(String id) {
		//topics.removeIf(t -> t.getId().equals(id));
        courseRepository.deleteById(id);
    }
}
