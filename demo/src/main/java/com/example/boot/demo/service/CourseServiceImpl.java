package com.example.boot.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.boot.demo.entity.Course;
import com.example.boot.demo.service.CourseService;
import com.example.boot.demo.dao.CourseDao;

@Service
public class CourseServiceImpl implements CourseService {
	@Autowired
	private CourseDao coursedao;
	
	public List<Course> getCourses() {
		return coursedao.findAll(); 
	}
	
	 public Course getCourse(int courseId) {
		 return coursedao.getOne(courseId);
	}
	 
	 public Course addCourse(Course course) {
		 return coursedao.save(course);
	} 
	 
	 public Course updateCourse(Course course) {
		 return coursedao.save(course);
	 }
	 
	 public void delCourse(int courseId) {
		 Course entity = coursedao.getById(courseId);
		 coursedao.delete(entity);
	 }
}
