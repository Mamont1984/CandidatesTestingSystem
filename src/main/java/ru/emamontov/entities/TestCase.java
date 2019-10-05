package ru.emamontov.entities;

import java.util.Date;
import java.util.List;

public class TestCase {
    private TestCaseState currentState;
    private String testCaseName;
    private Date creationTime;
    private User author;
    private List<Question> questions;
    private int passingResult;
}
