package ru.emamontov.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.emamontov.entities.Attempt;
import ru.emamontov.entities.Question;
import ru.emamontov.entities.Test;
import ru.emamontov.repositories.TestsRepository;

import java.util.List;

@Component
public class TestingServiceIMPL implements TestingService {
    @Autowired
    TestsRepository testsRepository;

    @Override
    public List<Test> getTestsList() {
        return testsRepository.getTestsList();
    }

    @Override
    public Attempt startTest(Test test) {
        return null;
    }

    @Override
    public Question getQuestion(Attempt attempt) {
        return null;
    }

    @Override
    public Question answerQuestion(Attempt attempt, int answer) {
        return null;
    }
}
