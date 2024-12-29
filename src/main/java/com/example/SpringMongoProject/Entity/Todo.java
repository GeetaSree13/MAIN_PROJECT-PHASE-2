package com.example.SpringMongoProject.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "todos")
public class Todo {
    @Id
    private String _id;
    private String todoName;
    private boolean completed;

    public Todo(String _id, String todoName, boolean completed) {
        this._id = _id;
        this.todoName = todoName;
        this.completed = completed;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getTodoName() {
        return todoName;
    }

    public void setTodoName(String todoName) {
        this.todoName = todoName;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "_id='" + _id + '\'' +
                ", todoName='" + todoName + '\'' +
                ", completed=" + completed +
                '}';
    }
}
