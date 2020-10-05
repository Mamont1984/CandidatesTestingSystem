package ru.emamontov.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.emamontov.entities.Test;

@Repository
public interface TestsRepository extends CrudRepository<Test, Long> {
}
