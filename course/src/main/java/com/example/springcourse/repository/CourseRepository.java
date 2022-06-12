package com.example.springcourse.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.springcourse.model.Course;

@Repository
public interface CourseRepository extends CrudRepository<Course, Serializable> {

}
