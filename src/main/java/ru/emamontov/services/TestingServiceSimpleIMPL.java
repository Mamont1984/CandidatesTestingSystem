package ru.emamontov.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.emamontov.entities.Test;
import ru.emamontov.repositories.TestsRepository;

import java.util.List;

@Service
public class TestingServiceSimpleIMPL implements TestingService {

    private TestsRepository testsRepository;

    @Autowired
    public TestingServiceSimpleIMPL(TestsRepository testsRepository) {
        this.testsRepository = testsRepository;
    }

    @Override
    public List<Test> getAllTests() {
        return (List<Test>) testsRepository.findAll();
    }
}
