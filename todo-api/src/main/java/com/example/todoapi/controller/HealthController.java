package com.example.todoapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController implements HealthApi {// implementsしたコントローラ二は@RestControllerを付ける
    @Override //Ctrl+O
    public ResponseEntity<Void> healthGet() {
        return  ResponseEntity.ok().build();

    }
}
