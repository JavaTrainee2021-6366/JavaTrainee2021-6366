package com.example.SpringDemo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.SpringDemo.entity.Course;
import com.example.SpringDemo.service.CourseService;
import com.example.SpringDemo.dao.CourseDao;

public class CourseServiceImpl implements CourseService {
       List<Course> list;
	
	public CourseServiceImpl() {
		

		list = new ArrayList<Course>();
		list.add(new Course(202, "Android", "Android Course"));
		list.add(new Course(203, "Iphone", "Iphone Course"));
		list.add(new Course(204, "Python", "Python Course"));
		list.add(new Course(205, "Java", "Java Course"));
		list.add(new Course(206, "SQA", "SQA Course"));

	}

	public List<Course> getCourses() {
		return list; 
	}
	
	 public Course getCourse(long courseId) {
		 Course c = null;
		 for(Course c1 : list)
		 {
			 if (c1.getId() == courseId)
			 {
				 c = c1;
				 break;
			 }
		 }
		 return c;
	 }
	 
	 public void addCourse(Course course) {
		 list.add(course);
	 }
	 
	 public void delCourse(long courseId) {
	 Course c = null;
	 for(Course c1 : list)
	 {
		 if (c1.getId() == courseId)
		 {
			list.remove(c);
			 break;
		 }
	 }
 }
	 
	 @Override
	 public Course updateCourse(Course course) {
		 list.forEach(e -> { 
			 if (e.getId()==course.getId()) {
		   e.setTitle(course.getTitle());
		   e.setDescription(course.getDescription()); }
		 });
		   list.add(course); 
           return course;
	 }
}
