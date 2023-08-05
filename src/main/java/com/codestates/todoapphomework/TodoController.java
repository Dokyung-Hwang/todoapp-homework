package com.codestates.todoapphomework;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

    @GetMapping
    public String todoApp() {
        return "To-do Application !";
    }
}
