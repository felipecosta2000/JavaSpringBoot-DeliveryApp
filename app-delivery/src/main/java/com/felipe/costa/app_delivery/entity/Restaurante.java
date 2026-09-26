package com.felipe.costa.app_delivery.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="restaurante")
@Entity
public class Restaurante {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @Column(nullable = false)
    private Double avaliacao;

    @Column(nullable = false)
    private Integer tempoEntrega;

    private LocalDateTime createAt;
    private LocalDateTime updateAt;


}
