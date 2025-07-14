package com.TaskManagementSystem.TaskManagementSystem;

import com.TaskManagementSystem.TaskManagementSystem.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<TaskEntity, Integer> {
}