package com.example.First_project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class wellcome {

    @GetMapping
    public String mensagem(){
        return "Bem vindo ao meu primeiro projeto Spring Boot!";
    }

    @GetMapping("/aluno")
    public String Aluno(){
        return "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
    }

    @GetMapping("/dev")
    public String dev(){
        return "ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ";
    }
}
