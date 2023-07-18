package com.example.todoapi.repository.sample.task;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@Mapper //MyBtisの定義ではinterfaceで書く
public interface TaskRepository {
    @Select("SELECT id,title,FROM tasks ORDER BY id LIMIT 1")
    Optional<TaskRecord> select();
}
