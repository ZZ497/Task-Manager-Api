package com.diego.task_manager_api.controller;

import com.diego.task_manager_api.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Realiza las peticiones HTTP
@RestController
public class HelloController {

    // Llevamos la clase de HelloService
    private final HelloService helloService;

    // Spring nos proporciona el objeto HelloService
    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

}