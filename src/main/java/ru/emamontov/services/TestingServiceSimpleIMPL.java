package ru.emamontov.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;
import ru.emamontov.entities.Test;
import ru.emamontov.repositories.TestsRepository;

import java.util.List;

@Service
public class TestingServiceSimpleIMPL implements TestingService {
    @Autowired
    TestsRepository testsRepository;

    @Override
    public List<Test> getAllTests() {
        return (List<Test>) testsRepository.findAll();
    }
}
