package com.example.springcourse.service;

import org.springframework.web.bind.annotation.RequestBody;

import com.example.springcourse.model.Course;

public interface CourseService {

	public Iterable<Course> getCourse();
	public Course addCourse(Course newCourse);
	public Course updateCourse(Course newCourse);
	public void deleteCourse(int id);
}
