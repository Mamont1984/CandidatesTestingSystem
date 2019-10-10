package ru.emamontov.repositories;

import ru.emamontov.entities.Test;

import java.util.List;

public interface TestsRepository {
    List<Test> getTestsList();
}
