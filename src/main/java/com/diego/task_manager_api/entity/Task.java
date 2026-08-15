package com.diego.task_manager_api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;
import org.hibernate.annotations.CreationTimestamp;
import java.time.LocalDateTime;

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
    /**
     * Título de la tarea
     */
    private String title;

    /**
     * Descripción de la tarea
     */
    private String description;

    /**
     * Indica si la tarea está completada
     */
    private boolean completed;

    /**
     * Fecha y hora en la que se creó la tarea.
     * Hibernate la establece automáticamente al guardar la entidad.
     */
    @CreationTimestamp
    private LocalDateTime createdAt;

    /**
     * Getters
     */
    public Long getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getDescription() {
        return this.description;
    }

    public boolean isCompleted() {
        return this.completed;
    }

    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setters
     */
    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
