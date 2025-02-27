package com.example.cms.controller;

import com.example.cms.controller.exceptions.StudentNotFoundException;
import com.example.cms.model.entity.Student;
import com.example.cms.model.entity.Survey;
import com.example.cms.model.repository.StudentRepository;
import com.example.cms.model.repository.SurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController

public class SurveyController {

    @Autowired
    private final SurveyRepository repository;

    public SurveyController(SurveyRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/survey")
    List<Survey> retrieveAllRecords() {

        return repository.findAll(); //used student entity as the template for this
    }


}
