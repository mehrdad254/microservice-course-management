package com.mhr.course.service;

import java.util.List;

import com.mhr.course.model.Course;
import com.mhr.course.model.Transaction;

public interface CourseService {

	List<Course> findAllCourse();

	Course findCourseById(Long courseId);

	List<Transaction> findTransactionOfUser(Long userId);

	List<Transaction> findTransactionOfCourse(Long courseId);

	Transaction saveTransaction(Transaction transaction);

}
