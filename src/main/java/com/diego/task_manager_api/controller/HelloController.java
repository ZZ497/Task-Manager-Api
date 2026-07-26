package com.diego.task_manager_api.controller;
import com.diego.task_manager_api.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Realiza las peticiones HTTP
@RestController
public class HelloController {

    // Llevamos la clase de HelloService
    private final HelloService helloService;

    // Creamos el constructor para poder usar el objeto
    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    HelloService myService = new HelloService();
    HelloController myController = new HelloController(myService);

    // Cuando se hace una petición GET a /, se ejecutará este método
    @GetMapping("/")
    // Método que se ejecuta al dirigirse a /
    public String hello(){
        return myService.sayHello();
    }
}
