package com.felipe.costa.app_delivery.respository;


import com.felipe.costa.app_delivery.entity.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RestauranteRepository extends JpaRepository<Restaurante, Long> {

    Restaurante findByNome(String nome);
    List<Restaurante> findByTempoEntrega(Integer tempoEntrega);

}
