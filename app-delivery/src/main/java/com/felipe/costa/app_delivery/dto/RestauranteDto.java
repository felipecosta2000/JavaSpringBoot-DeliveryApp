package com.felipe.costa.app_delivery.dto;


import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RestauranteDto {

    private Long id;
    private String nome;

    @Column(nullable = false)
    private Double avaliacao;

    @Column(nullable = false)
    private Integer tempoEntrega;

    private LocalDateTime createAt;
    private LocalDateTime updateAt;


}
