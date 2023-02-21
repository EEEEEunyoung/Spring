package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/home/*") // WEB_INF/view/home/ 접근중..
public class HomeController {
    @GetMapping("index")
    public String index() {
        log.info("index호출");
        return "home/index";

    }

    @GetMapping("index2")
    public String index2() {
        log.info("index2호출");
        return "redirect:index";

    }

}
