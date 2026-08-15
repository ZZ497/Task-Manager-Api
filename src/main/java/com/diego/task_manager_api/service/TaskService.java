package com.diego.task_manager_api.service;
import com.diego.task_manager_api.entity.Task;
import com.diego.task_manager_api.repository.TaskRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import java.util.Optional;


import java.util.List;

/**
 * Servicio que contiene la lógica de negocio
 * relacionada con las tareas.
 */
@Service
public class TaskService {

    // Repositorio que accede a la base de datos.
    private final TaskRepository taskRepository;

    /**
     * Spring inyecta automáticamente el TaskRepository.
     */
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    /**
     * Obtiene todas las tareas desde la base de datos.
     */
    public List <Task> getAllTasks(){
        return taskRepository.findAll();
    }
    /**
     * Crea un Task
     */
    public Task createTask (Task task){
        return taskRepository.save(task);
    }

    /**
     * Encontrar tarea por Id
     */
    public Optional<Task> getTaskById(Long id){
        return taskRepository.findById(id);
    }
}
