package com.parcial.mutantes.entities;

import jakarta.persistence.*;
import java.util.Arrays;

@Entity
@Table(name = "adn")
public class Dna {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false, name = "adn")
    private String[] dna;

    @Column(nullable = false, name = "es_mutante")
    private boolean isMutant;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String[] getDna() {
        return dna;
    }

    public void setDna(String[] dna) {
        this.dna = dna;
    }

    public boolean isMutant() {
        return isMutant;
    }

    public void setMutant(boolean mutant) {
        isMutant = mutant;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(dna);
    }
}
