package com.assignment.worldservice.serviceImpl;

import com.assignment.worldservice.service.WorldService;
import org.springframework.stereotype.Service;

@Service
public class WorldServiceImpl implements WorldService {


    @Override
    public String getWorldMessage() {
        return "World";
    }
}
