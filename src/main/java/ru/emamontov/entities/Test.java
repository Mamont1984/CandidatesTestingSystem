package ru.emamontov.entities;

import java.util.Date;
import java.util.List;

public class Test {
    private TestState currentState;
    private String testCaseName;
    private Date creationTime;
    private User author;
    private List<Question> questions;
    private int passingResult;
}
