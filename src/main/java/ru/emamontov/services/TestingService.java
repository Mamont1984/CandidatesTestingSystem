package ru.emamontov.services;

import ru.emamontov.entities.Attempt;
import ru.emamontov.entities.Question;
import ru.emamontov.entities.Test;

import java.util.List;

public interface TestingService {
    List<Test> getTestsList();
    Attempt startTest(Test test);
    Question getQuestion(Attempt attempt);
    Question answerQuestion(Attempt attempt, int answer);

}
