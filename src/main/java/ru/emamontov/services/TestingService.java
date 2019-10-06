package ru.emamontov.services;

import ru.emamontov.entities.Attempt;
import ru.emamontov.entities.Question;
import ru.emamontov.entities.Test;

public interface TestingService {
    Attempt startTestCase(Test test);
    Question getCurrentQuestion(Attempt attempt);
    Question answerCurrentQuestion(Attempt attempt, int answer);

}
