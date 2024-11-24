package com.example;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
public class client {
    public static RestClient restClient(){
       return RestClient.builder()
                .baseUrl("https://api.restful-api.dev")
                .defaultHeader("Content-Type", "application/json")
                .build();


    }
}
