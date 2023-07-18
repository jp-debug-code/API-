package com.example.todoapi.service.sample;

import com.example.todoapi.repository.sample.SampleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class Sampleservice {
    private final SampleRepository repository;
    public  SampleEntity find(){
        var record=repository.select();
        return new SampleEntity(record.getContent());
    }
}
