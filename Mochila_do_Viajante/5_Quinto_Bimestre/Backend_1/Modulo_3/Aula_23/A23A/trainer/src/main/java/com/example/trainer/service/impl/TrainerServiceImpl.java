package com.example.trainer.service.impl;

import com.example.trainer.model.Trainer;
import com.example.trainer.service.TrainerService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TrainerServiceImpl  implements TrainerService {

    @Override
    public List<Trainer> listTrainer(){
        return Arrays.asList(new Trainer("Marcos"), new Trainer("Ana"));
    }
}
