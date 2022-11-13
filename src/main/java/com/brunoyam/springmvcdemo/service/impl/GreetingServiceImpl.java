package com.brunoyam.springmvcdemo.service.impl;

import com.brunoyam.springmvcdemo.service.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String greeting(String name) {
        return "Hello " + name + "!";
    }

}
