package ru.emamontov.services;

import ru.emamontov.entities.Attempt;
import ru.emamontov.entities.Question;
import ru.emamontov.entities.TestCase;

public interface TestingService {
    Attempt startTestCase(TestCase testCase);
    Question getCurrentQuestion(Attempt attempt);
    Question answerCurrentQuestion(Attempt attempt, int answer);

}
