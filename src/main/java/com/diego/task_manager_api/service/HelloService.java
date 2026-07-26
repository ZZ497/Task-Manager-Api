package com.diego.task_manager_api.service;
import org.springframework.stereotype.Service;

// Nos encargamos de que esta clase llegue se encargue de la lógica
@Service
public class HelloService {

        // Método que proyecta mensaje en la web
        public String sayHello(){
            return "Hello from the Service!";
        }
    }
