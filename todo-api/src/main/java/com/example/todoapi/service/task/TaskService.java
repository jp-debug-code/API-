package com.example.todoapi.service.task;

import com.example.todoapi.repository.sample.task.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TaskService {
    private final TaskRepository taskRepository;
    public taskEntity find() {

    return taskRepository.select()
            .map(record -> new taskEntity(record.getId(),record.getTitle()))//taskEntityに渡す
                     .orElseThrow(() -> new IllegalStateException("TODO"));
    }
}
