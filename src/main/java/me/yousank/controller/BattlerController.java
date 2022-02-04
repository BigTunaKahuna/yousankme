package me.yousank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BattlerController {

    @GetMapping
    public String foo() {
        return "Hello World";
    }
}
