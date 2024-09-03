package com.maybank.assessment.maybankassessment.controller;

import com.maybank.assessment.maybankassessment.service.ExternalApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/external")
public class ExternalApiController {

    @Autowired
    private ExternalApiService externalApiService;

    @GetMapping("")
    public String getRandomPerson() {
        return externalApiService.getRandomUser();
    }
}