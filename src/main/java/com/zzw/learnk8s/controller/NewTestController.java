package com.zzw.learnk8s.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewTestController {
    @GetMapping(value = "/new_test")
    public String newTest() {
        return "k8s new test";
    }
}
