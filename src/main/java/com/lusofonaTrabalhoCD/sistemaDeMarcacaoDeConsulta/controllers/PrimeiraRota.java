package com.lusofonaTrabalhoCD.sistemaDeMarcacaoDeConsulta.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/test")
public class PrimeiraRota {
  @GetMapping("/")
  public ResponseEntity HelloWorld() {
    return ResponseEntity.status(HttpStatus.OK).body("Hello World!");
  }
}
