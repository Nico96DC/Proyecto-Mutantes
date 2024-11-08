package com.parcial.mutantes.repositories;

import com.parcial.mutantes.entities.Dna;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DnaRepository extends JpaRepository<Dna, Long> {
    Optional<Dna> findByDna(String[] dna);
    Long countByIsMutant(boolean isMutant);
}
