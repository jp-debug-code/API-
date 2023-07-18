package com.example.todoapi.repository.sample.task;

import lombok.Value;
//データを格納する
@Value
public class TaskRecord {
    long id;
    String title;
}
