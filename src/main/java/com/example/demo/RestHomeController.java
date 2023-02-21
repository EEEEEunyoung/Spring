package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class RestHomeController {
    @GetMapping("/home")
    public String home() {
        log.debug("hiroo debug");
        log.info("hiroo   info ");
        log.warn("hiroo   warn ");
        log.error("hiroo   error ");

        return "spring gradle test!!!";
    }
}
