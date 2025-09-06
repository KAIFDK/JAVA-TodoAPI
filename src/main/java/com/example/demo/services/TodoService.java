package com.example.demo.services;


import com.example.demo.models.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service //to directly inject object

public class TodoService {

    private List<Todo> list = new ArrayList<>();

    public Todo create(Todo todo){
        list.add(todo);
        return todo;
    }

    public List<Todo> getList(){
        return list;
    }

}
