package com.project.quizapp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project.quizapp.Question;

@Repository
public interface QuestionDao  extends JpaRepository<Question, Integer>{
	
	
	List<Question> findByCategory(String category);
	
	
	@Query(value="SELECT * FROM questions q where q.category=:category ORDER BY RAND() LIMIT :num",nativeQuery = true)
	List<Question> findRandomQuestionByCategory(String category, int num);
}
