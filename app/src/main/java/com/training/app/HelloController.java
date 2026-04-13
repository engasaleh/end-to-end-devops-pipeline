package com.training.app;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Hello🧑🏻‍💻, Welcome to DevOps♾️ End-to-End Project with fully GitOps Atomated🚀";
    }
}
