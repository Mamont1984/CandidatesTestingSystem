package ru.emamontov.services;

import ru.emamontov.entities.Attempt;
import ru.emamontov.entities.Question;
import ru.emamontov.entities.Test;

public class TestingServiceIMPL implements TestingService {
    @Override
    public Attempt startTestCase(Test test) {
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
