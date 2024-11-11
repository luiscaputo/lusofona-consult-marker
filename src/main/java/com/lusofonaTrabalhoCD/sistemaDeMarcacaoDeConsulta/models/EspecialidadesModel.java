package com.lusofonaTrabalhoCD.sistemaDeMarcacaoDeConsulta.models;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "tb_especialidades")
public class EspecialidadesModel {
  @Id
  @GeneratedValue(generator="UUID")
  private UUID id;

  private String name;
  private String descricao;

  @CreationTimestamp
  private LocalDateTime criadoEm;
}
