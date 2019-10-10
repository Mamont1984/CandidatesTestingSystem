package ru.emamontov.entities;

import java.util.List;

public class Test {
    private String name;
    private User author;
    private List<Question> questions;
    private int minimumPassingResult;

    public Test(String name, User author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }
}
