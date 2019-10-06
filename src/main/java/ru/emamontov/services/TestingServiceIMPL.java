package ru.emamontov.services;

import ru.emamontov.entities.Attempt;
import ru.emamontov.entities.Question;
import ru.emamontov.entities.Test;

public class TestingServiceIMPL implements TestingService {
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
