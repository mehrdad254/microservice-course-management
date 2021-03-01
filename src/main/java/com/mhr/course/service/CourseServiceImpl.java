package com.mhr.course.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mhr.course.model.Course;
import com.mhr.course.model.Transaction;
import com.mhr.course.repository.CourseRepository;
import com.mhr.course.repository.TransactionRepository;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepository courseRepository;
	
	@Autowired
	private TransactionRepository transactionRepository;
	
	@Override
	public List<Course> findAllCourse(){
		return this.courseRepository.findAll();
	}
	
	@Override
	public Course findCourseById(Long courseId) {
		return this.courseRepository.findById(courseId).orElse(null);
	}
	
	@Override
	public List<Transaction> findTransactionOfUser(Long userId){
		return this.transactionRepository.findAllCourseById(userId);
	}
	
	@Override
	public List<Transaction> findTransactionOfCourse(Long courseId){
		return this.transactionRepository.findAllCourseById(courseId);
	}
	
	@Override
	public Transaction saveTransaction(Transaction transaction) {
		return this.transactionRepository.save(transaction);
	}
}
