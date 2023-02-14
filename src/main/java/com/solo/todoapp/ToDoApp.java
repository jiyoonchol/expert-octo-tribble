package com.solo.todoapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToDoApp {
    @GetMapping("/")
    public String getToDoApp() {return "To-do Application!";}
}
