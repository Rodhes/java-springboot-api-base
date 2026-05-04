package com.rodhes.aulaspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OlaController {

    @GetMapping("/")
    public String home() {
        return "Servidor Spring Boot rodando com sucesso! 🚀";
    }
}