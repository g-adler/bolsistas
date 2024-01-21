package org.example.backend.controller;

import org.example.backend.service.BolsistaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/bolsistas")
public class BolsistaController {

    BolsistaService bolsistaService;

    @GetMapping("/health")
    public ResponseEntity healthCheck(){
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
