package com.lusofonaTrabalhoCD.sistemaDeMarcacaoDeConsulta.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lusofonaTrabalhoCD.sistemaDeMarcacaoDeConsulta.models.PacientesModel;
import com.lusofonaTrabalhoCD.sistemaDeMarcacaoDeConsulta.services.PacienteService;


@RestController
@RequestMapping("/pacientes")
public class PacienteController {

  @PostMapping("/")
  public ResponseEntity create(@RequestBody PacientesModel input) {
    var service = new PacienteService();
      var result = service.create(input);
      
      return ResponseEntity.status(HttpStatus.CREATED).body(result);
  }
}
