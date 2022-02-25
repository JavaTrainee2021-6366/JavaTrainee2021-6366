package com.example.boot.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.boot.demo.entity.Course;

public interface CourseDao extends JpaRepository<Course, Integer> {

}
