package com.secfix.todos.database.repositories;

import com.secfix.todos.database.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface TaskRepository extends JpaRepository<Task, Integer> {

    List<Task> findByOwnerId(Integer userId);
}
