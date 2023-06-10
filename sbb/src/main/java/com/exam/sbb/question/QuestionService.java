package com.exam.sbb.question;

import com.exam.sbb.DataNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class QuestionService {

    private final QuestionRepository questionRepository;
    private QuestionService questionService;

    public List<Question> getList() {
        return this.questionRepository.findAll();
    }

    public Question getQuestion(int id) {
        return questionRepository.findById(id)
                .orElseThrow(() -> new DataNotFoundException("no %d question not found".formatted(id)));
    }
}
