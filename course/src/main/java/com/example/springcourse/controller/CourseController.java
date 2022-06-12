package com.example.springcourse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springcourse.model.Course;
import com.example.springcourse.service.CourseService;
//http://localhost:8080/courses/getAllCourses
@RestController
@RequestMapping("/courses")
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/getAllCourses")
	public Iterable<Course> getCourse() {
		return courseService.getCourse();
	}
	
	@PostMapping("/addCourse")
	public Course addCourse(@RequestBody Course newCourse) {
		return courseService.addCourse(newCourse);
	}
	

	@PutMapping("/updateCourse")
	public Course updateCourse(@RequestBody Course newCourse) {
		return courseService.updateCourse(newCourse);
	}
	
	@DeleteMapping("/DeleteCourse/{courseId}")
	public String deleteCourse( @PathVariable int courseId) {
		 courseService.deleteCourse(courseId);
		 return "record deleted successfully....";
	}
}
