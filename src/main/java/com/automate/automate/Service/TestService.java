package com.automate.automate.Service;

import org.springframework.stereotype.Service;

@Service
public class TestService {
    private String hello;

    public TestService(String hello) {
        this.hello = hello;
    }


}
