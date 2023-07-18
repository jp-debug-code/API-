package com.example.todoapi.controller.task;

import com.example.todoapi.controller.TasksApi;
import com.example.todoapi.controller.model.TaskDTO;
import com.example.todoapi.service.task.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
@RequiredArgsConstructor //依存性の注入
@RestController
public class TaskController implements TasksApi {
    private final TaskService taskService;
    @Override
    public ResponseEntity<TaskDTO> showTask() {
        var entity=taskService.find();
        var dto =new TaskDTO();
        dto.setId(entity.getId());//entity→dto
        dto.setTitle(entity.getTitle());




        return ResponseEntity.ok(dto);
    }
};