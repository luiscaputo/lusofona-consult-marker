package com.lusofonaTrabalhoCD.sistemaDeMarcacaoDeConsulta.models;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "tb_clinicas")
public class ClinicasModel {
  @Id()
  @GeneratedValue(generator = "UUID")
  private UUID id;  

  private String nome;
  private String endereco;

  @CreationTimestamp
  private LocalDateTime criadoEm;

}
