package com.example.SpringMongoProject.Repo;

import com.example.SpringMongoProject.Entity.Todo;
import com.example.SpringMongoProject.Entity.Todo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepo extends MongoRepository<Todo,String> {
}
