package com.github.jenkinstest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author menghe
 * @since 2023/12/5
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "Hello Jenkins";
    }
}
