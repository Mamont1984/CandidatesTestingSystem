package ru.emamontov.services;

import ru.emamontov.entities.Attempt;
import ru.emamontov.entities.Question;
import ru.emamontov.entities.Test;

public interface TestingService {
    Attempt startTest(Test test);
    Question getQuestion(Attempt attempt);
    Question answerQuestion(Attempt attempt, int answer);

}
