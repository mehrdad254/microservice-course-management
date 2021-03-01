package com.mhr.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mhr.course.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
