package com.felipe.costa.app_delivery.controller;


import com.felipe.costa.app_delivery.entity.Restaurante;
import com.felipe.costa.app_delivery.service.RestauranteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/restaurante")
public class RestauranteController {

    @Autowired
    private RestauranteService service;

    @PostMapping("/criar")
    public ResponseEntity<?> criar(@RequestBody Restaurante restaurante){

        try{
            Restaurante resp = service.saveRestaurante(restaurante);
            return ResponseEntity.ok(resp);

        }catch (Exception exception){

            return ResponseEntity.status(500).body(exception.getMessage());
        }

    }

    @GetMapping("/listar")
    public ResponseEntity<?>listar(){ return ResponseEntity.status(200).body(service.restaurante()); }


}
