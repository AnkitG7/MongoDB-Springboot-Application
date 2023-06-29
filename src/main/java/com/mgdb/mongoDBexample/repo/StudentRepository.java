package com.mgdb.mongoDBexample.repo;

import com.mgdb.mongoDBexample.models.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, Integer> {
}
