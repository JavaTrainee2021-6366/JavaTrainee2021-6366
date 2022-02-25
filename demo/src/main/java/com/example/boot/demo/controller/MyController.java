package com.example.boot.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.boot.demo.service.CourseService;
import com.example.boot.demo.service.CourseServiceImpl;
import com.example.boot.demo.entity.Course;

@RestController
public class MyController {
@Autowired
private CourseService obj ;
	
	@GetMapping("/home")
	public String home() {
		
		return "Welcome Home";
	}
	
	@GetMapping("/courses")
	public List<Course> getCourses() {
		return this.obj.getCourses();
	}
	
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		return this.obj.getCourse(Integer.parseInt(courseId));
	}
	
	@PostMapping("/addCourse")
	public Course addCourse(@RequestBody Course course) {
		return this.obj.addCourse(course);
	}
	
	@DeleteMapping("/courses/{courseId}")
	public String delCourse(@PathVariable String courseId) {
		 this.obj.delCourse(Integer.parseInt(courseId));
		 return "Deleted Successfully";
	}
	
	@PutMapping("/courses")
	public Course updateCourse(@RequestBody Course course) {
		return this.obj.updateCourse(course);
   }
}

