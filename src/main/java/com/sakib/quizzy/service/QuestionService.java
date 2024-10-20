package com.sakib.quizzy.service;

import com.sakib.quizzy.Question;
import com.sakib.quizzy.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionDao questionDao;

    public List<Question> getAllQuestions() {
    return questionDao.findAll();
    }
}
