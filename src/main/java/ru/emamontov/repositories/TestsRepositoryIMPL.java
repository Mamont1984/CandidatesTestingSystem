package ru.emamontov.repositories;

import org.springframework.stereotype.Repository;
import ru.emamontov.entities.Test;
import ru.emamontov.entities.User;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TestsRepositoryIMPL implements TestsRepository {
    List<Test> tests = new ArrayList<>();

    public TestsRepositoryIMPL() {
        tests.add(new Test("Test1", new User("Petrovich")));
        tests.add(new Test("Test2", new User("Vovan")));
        tests.add(new Test("Test3", new User("Vasya")));
    }

    @Override
    public List<Test> getTestsList() {return tests;}
}
