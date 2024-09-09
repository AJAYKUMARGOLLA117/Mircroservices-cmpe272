package com.assignment.helloservice.serviceImpl;

import com.assignment.helloservice.service.HelloService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloServiceImpl implements HelloService {

    private static final String WORLD_SERVICE_URL = "http://spring-boot-world-service:8081/api/getWorldMessage";

    @Override
    public String getHelloWorldMessage() {

        String hello="Hello ";

        RestTemplate restTemplate=new RestTemplate();

        try{
            String worldMessage = restTemplate.getForObject(WORLD_SERVICE_URL, String.class);

            return  hello+worldMessage;
        }
        catch (Exception ex){
            return  String.format("Failed to Connect to world Service %",ex.getMessage());
        }



    }
}
