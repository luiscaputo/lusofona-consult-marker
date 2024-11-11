package com.lusofonaTrabalhoCD.sistemaDeMarcacaoDeConsulta.models;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import com.lusofonaTrabalhoCD.sistemaDeMarcacaoDeConsulta.utils.EstadoConsultaEnum;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;


@Data
@Entity(name = "tb_consultas")
public class ConsultasModel {
  @Id()
  @GeneratedValue(generator = "UUID")
  private UUID id;  

  private LocalDateTime data;
  private LocalDateTime hora;

  private EstadoConsultaEnum estadoConsulta;

  private UUID pacienteId;
  private UUID especialidadeId;
  private UUID clinicaId;

  @CreationTimestamp
  private LocalDateTime criadoEm;
}
