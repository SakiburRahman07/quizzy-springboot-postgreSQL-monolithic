package com.sakib.quizzy.service;

import com.sakib.quizzy.dao.QuestionDao;
import com.sakib.quizzy.dao.QuizDao;
import com.sakib.quizzy.model.Question;
import com.sakib.quizzy.model.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {

    @Autowired
    QuizDao quizDao;
    @Autowired
    QuestionDao questionDao;

    public ResponseEntity<String> createQuiz(String category, int numQ, String title) {
        List<Question> questions = questionDao.findRandomQuestionsByCategory(category,numQ);
        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setQuestions(questions);
        quizDao.save(quiz);

return new ResponseEntity<>("Success", HttpStatus.OK);
    }
}
