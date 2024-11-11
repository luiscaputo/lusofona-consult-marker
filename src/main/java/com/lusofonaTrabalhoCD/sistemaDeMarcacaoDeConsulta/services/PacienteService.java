package com.lusofonaTrabalhoCD.sistemaDeMarcacaoDeConsulta.services;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;

import com.lusofonaTrabalhoCD.sistemaDeMarcacaoDeConsulta.models.PacientesModel;
import com.lusofonaTrabalhoCD.sistemaDeMarcacaoDeConsulta.repositorios.PacientesRepository;

import at.favre.lib.crypto.bcrypt.BCrypt;

public class PacienteService {

  @Autowired
  private PacientesRepository repository;
  public PacientesModel create(PacientesModel pacientModel) {
    // var paciente = this.repository.findBy("email", pacientModel.getEmail());

    // if(paciente != null){
    //   throw new IllegalArgumentException("Já existe um paciente cadastrado com este email.");
    // }

    var dataDeHoje = LocalDateTime.now();

    if(pacientModel.getDataDeNascimento().isAfter(dataDeHoje)) {
      throw new IllegalArgumentException("A data de nascimento não pode ser posterior a data de hoje.");
    }

    var passwordHash = BCrypt.withDefaults().hashToString(12, pacientModel.getPassword().toCharArray());
    pacientModel.setPassword(passwordHash);

    return this.repository.save(pacientModel); 
  }
}
