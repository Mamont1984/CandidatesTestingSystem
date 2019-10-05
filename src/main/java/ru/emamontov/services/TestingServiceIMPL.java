package ru.emamontov.services;

import ru.emamontov.entities.Attempt;
import ru.emamontov.entities.Question;
import ru.emamontov.entities.TestCase;

public class TestingServiceIMPL implements TestingService {
    @Override
    public Attempt startTestCase(TestCase testCase) {
        return null;
    }

    @Override
    public Question getCurrentQuestion(Attempt attempt) {
        return null;
    }

    @Override
    public Question answerCurrentQuestion(Attempt attempt, int answer) {
        return null;
    }
}
