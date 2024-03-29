package com.springBoot.learnSpringBoot.courses.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springBoot.learnSpringBoot.courses.bean.Course;
import com.springBoot.learnSpringBoot.courses.repository.CourseRepository;

@RestController
@RequestMapping("/rest/spring")
public class CourseController {
	
	//This is course controller

	@Autowired
	CourseRepository courseRepository;

	JdbcTemplate jdbc;
	//Below mentioned API is to fetch courses

	@GetMapping("/courses")
	public List<Course> getAllCourses() {
		return courseRepository.findAll();
	}
	
	@GetMapping("/co")
	public List<Course> getAllData() {
		return courseRepository.findAll();
	}

	@GetMapping("/start")
	public String startProject() {

		System.out.println("Developer of the application is :Aditya Gupta");
		System.out.println("For testing purpose for specefic feature.");
		System.out.println("This application is under development by latestTech...");
		return "Hi this is the intial stage of the spring project by latestTech and all the backend API dvelopment would be manged here..";
	}

	@GetMapping("/courses/1")
	public Course getCoursesDetails() {
		//ABC
		return (new Course(1, "Learn Spring Boot", "latestTech"));
	}

	@RequestMapping("/insert")
	public String index() {
		// jdbc.execute("insert into students(name)values('Aryya')");
		return "Data Entry Successful";
	}
}
