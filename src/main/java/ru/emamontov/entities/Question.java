package ru.emamontov.entities;

import java.io.Serializable;

public class Question implements Serializable {
    private long id;
    private String question;
    private String[] answers;
}
