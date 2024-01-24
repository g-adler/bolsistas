package org.example.backend.controller;

import org.example.backend.service.BolsistaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class BolsistaController {

    @Autowired
    private BolsistaService bolsistaService;

    public BolsistaController(BolsistaService bolsistaService){
        this.bolsistaService = bolsistaService;
    }

    @GetMapping("/health")
    public ResponseEntity healthCheck(){
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/bolsistas")
    public ResponseEntity getAllBolsistas(){

        return new ResponseEntity<>(HttpStatus.FOUND);
    }

    @GetMapping("/bolsistas/{id}")
    public ResponseEntity getBolsista(){

        return new ResponseEntity<>(HttpStatus.FOUND);
    }

    @PostMapping("/bolsistas")
    public ResponseEntity createBolsista(){

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/bolsistas/{id}")
    public ResponseEntity deleteBolsista(){

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PatchMapping("/bolsistas/{id}")
    public ResponseEntity updateBolsista(){

        return new ResponseEntity<>(HttpStatus.OK);
    }
}