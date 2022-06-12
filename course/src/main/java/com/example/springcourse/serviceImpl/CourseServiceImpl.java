package com.example.springcourse.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.springcourse.model.Course;
import com.example.springcourse.repository.CourseRepository;
import com.example.springcourse.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepository courseRepository;
	
	@Override
	public Iterable<Course> getCourse() {
		
		Iterable<Course> courseList=courseRepository.findAll();
		return courseList;
	}

	@Override
	public Course addCourse(Course newCourse) {
        return courseRepository.save(newCourse);
	}

	@Override
	public Course updateCourse(Course newCourse) {
		return courseRepository.save(newCourse);
	}

	@Override
	public void deleteCourse(int id) {
		courseRepository.deleteById(id);
	}

}
