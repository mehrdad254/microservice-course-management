package com.mhr.course.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mhr.course.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction,Long> {

	List<Transaction> findAllCourseById(Long courseId);

	List<Transaction> findAllUserById(Long userId);
	
}
