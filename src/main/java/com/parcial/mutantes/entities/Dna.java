package com.parcial.mutantes.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "adn")
public class Dna {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false, name = "ADN")
    private String[] dna;

    @Column(nullable = false, name = "Es mutante")
    private boolean isMutant;
}
