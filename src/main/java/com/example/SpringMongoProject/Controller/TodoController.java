package com.example.SpringMongoProject.Controller;

import com.example.SpringMongoProject.Entity.Todo;
import com.example.SpringMongoProject.Service.TodoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/todo")
public class TodoController {

    @Autowired
    private TodoServices todoServices;

    @PostMapping(value = "/save")
    private String saveTodo(@RequestBody Todo todo) {

        todoServices.saveorUpdate(todo);
        return todo.get_id();
    }

    @GetMapping(value = "/getall")
    public Iterable<Todo> getTodos() {
        return todoServices.listAll();
    }

    @PutMapping(value = "/edit/{id}")
    private Todo update(@RequestBody Todo todo, @PathVariable(name = "id") String _id) {
        todo.set_id(_id);
        todoServices.saveorUpdate(todo);
        return todo;
    }

    @DeleteMapping("/delete/{id}")
    private void deleteTodo(@PathVariable("id") String _id) {
        todoServices.deleteTodo(_id);
    }


    @RequestMapping("/search/{id}")
    private Todo getTodos(@PathVariable(name = "id") String todoid) {
        return todoServices.getTodoByID(todoid);
    }

}
