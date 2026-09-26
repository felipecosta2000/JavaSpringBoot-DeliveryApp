package com.felipe.costa.app_delivery.service;


import com.felipe.costa.app_delivery.entity.Restaurante;
import com.felipe.costa.app_delivery.respository.RestauranteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestauranteService {

    private final RestauranteRepository repository;

    public RestauranteService(RestauranteRepository repository) { this.repository = repository; }

    public Restaurante saveRestaurante(Restaurante restaurante) { return repository.save(restaurante); }

    public List<Restaurante> restaurante() { return repository.findAll();}


}
