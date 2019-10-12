package ru.emamontov.entities;

public class Attempt extends BaseEntity {
    private Test test;
    private User applicant;
    private int correctAnswers;
    private boolean success;
}
