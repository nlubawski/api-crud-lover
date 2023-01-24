package com.crud.apicrudlover.Dto;

import java.util.Date;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;

public record CarDTO(
  
  @NotBlank String modelo,
  
  @NotBlank String fabricante,

  @Past Date dataFabricacao,

  @NotNull Double valor,

  @NotNull int anoModelo) {
  
}
