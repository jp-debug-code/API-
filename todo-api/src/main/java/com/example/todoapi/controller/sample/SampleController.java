package com.example.todoapi.controller.sample;

import com.example.todoapi.repository.sample.SampleRepository;
import com.example.todoapi.service.sample.Sampleservice;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/samples")
@RequiredArgsConstructor //DIを注入する
public class SampleController {
    private final Sampleservice service;
    private final SampleRepository repository;
    @GetMapping //@RequestMapping("/samples")のようにURLを付けた場合は @GetMappingにはURLを付けない
    public sampleDTO index(){
        var entity = service.find();
        return new sampleDTO(entity.getContent(), LocalDateTime.now());
    }//コンストラクタの呼び出し
}
