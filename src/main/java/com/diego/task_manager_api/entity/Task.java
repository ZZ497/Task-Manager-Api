package com.diego.task_manager_api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Representa una tarea de la aplicación.
 * Hibernate convertirá esta clase en una tabla de la base de datos.
 */
@Entity
public class Task {

    /**
     * Identificador único de la tarea.
     * Se genera automáticamente en la base de datos.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}