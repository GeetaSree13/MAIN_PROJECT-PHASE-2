package com.example.SpringMongoProject.Service;

import com.example.SpringMongoProject.Entity.Todo;
import com.example.SpringMongoProject.Entity.Todo;
import com.example.SpringMongoProject.Repo.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service



@Service
public class TodoServices {

    @Autowired
    private TodoRepo repo;

    public void saveorUpdate(Todo todo) {

        repo.save(todo);
    }

    public Iterable<Todo> listAll() {

        return this.repo.findAll();
    }

    public void deleteTodo(String id) {
        repo.deleteById(id);
    }

    public Todo getTodoByID(String todoid) {

        return repo.findById(todoid).get();
    }
}
