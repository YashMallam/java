package com.project.quizapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.project.quizapp.Question;
import com.project.quizapp.QuestionWrapper;
import com.project.quizapp.Response;
import com.project.quizapp.dao.QuestionDao;
import com.project.quizapp.dao.Quiz;
import com.project.quizapp.dao.QuizDao;

@Service
public class QuizService {
	
	@Autowired
	QuizDao quizDao;
	@Autowired
	QuestionDao questionDao;

	public ResponseEntity<String> createQuiz(String category, int num, String title) {
		
		List<Question> question= questionDao.findRandomQuestionByCategory(category,num);
		Quiz quiz=new Quiz();
		quiz.setTitle(title);
		quiz.setQuestions(question);
		quizDao.save(quiz);
		
		return new ResponseEntity<>("Success",HttpStatus.CREATED);
	}

	public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(Integer id) {
		
		Optional<Quiz> quiz= quizDao.findById(id);
		List<Question> questionsFromDb=quiz.get().getQuestions();
		List<QuestionWrapper> questionsForUser=new ArrayList<>();
		for(Question q:questionsFromDb) {
			QuestionWrapper qw=new QuestionWrapper(q.getId(),q.getTitle(),q.getOption1(),q.getOption2(),q.getOption3());
			questionsForUser.add(qw);
		}
		return new ResponseEntity<>(questionsForUser,HttpStatus.OK);
	}

	public ResponseEntity<Integer> calculateResult(Integer id,List<Response> responses) {
		Quiz quiz=quizDao.findById(id).get();
		List<Question> questions=quiz.getQuestions();
		int right=0;
		int i=0;
		for(Response response:responses) {
			if(response.getResponse().equals(questions.get(i).getAnswer()))
					right++;
			i++;
		}
		return new ResponseEntity<>(right,HttpStatus.OK);
	}
	
	
	

}
