package com.example.boot.demo.service;

import java.util.List;
import com.example.boot.demo.entity.Course;

public interface CourseService {

	public List<Course> getCourses();
    public Course getCourse(int courseId);
    public Course addCourse(Course course);
    public void delCourse(int courseId);
    public Course updateCourse(Course course);
    
}
