package io.javabrains.springboot.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import io.javabrains.springboot.jainbrains.Topic;



@Entity
public class Course {
    @Id
    private String id;
    private String name;
    private String description;

    @ManyToOne
    private Topic topic;

    

    public Course() {
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public Course(String id, String name, String description,String topicId ) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.topic=new Topic (topicId,"","");
    }

    public Course id(String id) {
        this.id = id;
        return this;
    }

    public Course name(String name) {
        this.name = name;
        return this;
    }

    public Course description(String description) {
        this.description = description;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", description='" + getDescription() + "'" +
            "}";
    }

   
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


   

 
}
