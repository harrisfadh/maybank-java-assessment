package com.maybank.assessment.maybankassessment.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ExternalApiService {

    @Value("https://randomuser.me/api/")
    private String apiUrl;

    private final RestTemplate restTemplate;

    public ExternalApiService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getRandomUser() {
         return restTemplate.getForObject(apiUrl, String.class);
    }
}