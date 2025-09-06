package com.example.demo.controllers;

import com.example.demo.models.Todo;
import com.example.demo.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos") // for request URL

public class TodoControllers {


    @Autowired
    private TodoService todoService;

    //create todo

    @PostMapping
    public Todo createTodo(@RequestBody Todo todo){   //@RequestBody to handleTodo Data

            //create todo
            return todoService.create(todo);
        }

        @GetMapping
        public List<Todo> getAll(){

            return todoService.getList();

        }

    }


