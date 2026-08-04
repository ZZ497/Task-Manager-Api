package com.diego.task_manager_api.controller;

import com.diego.task_manager_api.service.TaskService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controlador encargado de recibir las peticiones HTTP relacionadas con las tareas.
 */
@RestController
@RequestMapping("/tasks")
public class TaskController {

    // Servicio que contiene la lógica de negocio de las tareas.
    private final TaskService taskService;

    /**
     * Spring inyecta automáticamente el TaskService cuando crea este controlador.
     */
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }
}
