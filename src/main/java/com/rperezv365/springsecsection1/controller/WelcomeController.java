package com.rperezv365.springsecsection1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * WelcomeController
 * <p>
 * Created by IntelliJ, Spring Framework Guru.
 *
 * @author architecture - pvraul
 * @version 13/08/2025 - 11:33
 * @since 1.17
 */
@RestController
public class WelcomeController {

    @GetMapping("/welcome")
    public String sayWelcome() {
        return "Welcome to Spring Application with security";
    }
}
