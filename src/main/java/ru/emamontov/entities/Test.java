package ru.emamontov.entities;

import java.io.Serializable;
import java.util.List;

public class Test implements Serializable {
    private long id;
    private String name;
    private List<Question> questions;
}
