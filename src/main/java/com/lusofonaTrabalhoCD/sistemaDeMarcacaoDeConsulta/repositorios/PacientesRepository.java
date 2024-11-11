package com.lusofonaTrabalhoCD.sistemaDeMarcacaoDeConsulta.repositorios;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lusofonaTrabalhoCD.sistemaDeMarcacaoDeConsulta.models.PacientesModel;


public interface  PacientesRepository extends JpaRepository<PacientesModel, UUID>{
  // PacientesModel pacientePorEmail(String email);
}
