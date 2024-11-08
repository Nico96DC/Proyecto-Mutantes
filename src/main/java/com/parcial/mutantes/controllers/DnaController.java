package com.parcial.mutantes.controllers;

import com.parcial.mutantes.services.DnaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mutant")
public class DnaController {

    @Autowired
    private DnaService dnaService;

    @PostMapping("/")
    public ResponseEntity<String> isMutant(@RequestBody String[] dna) {
        try {
            return ResponseEntity.ok("Mutante detectado");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body("No es mutante");
        }
    }
}
