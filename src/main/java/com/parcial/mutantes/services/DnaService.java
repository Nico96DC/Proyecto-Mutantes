package com.parcial.mutantes.services;

import com.parcial.mutantes.repositories.DnaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DnaService {

    @Autowired
    private DnaRepository dnaRepository;

    private boolean checkHorizontal(String[] dna, int row, int col) {
        if (col + 3 < dna.length) {
            return dna[row].charAt(col) == dna[row].charAt(col + 1) && dna[row].charAt(col) == dna[row].charAt(col + 2) && dna[row].charAt(col) == dna[row].charAt(col + 3);
        }
        return false;
    }

    private boolean checkVertical(String[] dna, int row, int col) {
        if (row + 3 < dna.length) {
            return dna[row].charAt(col) == dna[row + 1].charAt(col) && dna[row].charAt(col) == dna[row + 2].charAt(col) && dna[row].charAt(col) == dna[row + 3].charAt(col);
        }
        return false;
    }

    private boolean checkDiagonal(String[] dna, int row, int col) {
        if (row + 3 < dna.length && col + 3 < dna.length) {
            return dna[row].charAt(col) == dna[row + 1].charAt(col + 1) && dna[row].charAt(col) == dna[row + 2].charAt(col + 2) && dna[row].charAt(col) == dna[row + 3].charAt(col + 3);
        }
        return false;
    }

    public boolean isMutant(String[] dna) {
        int n = dna.length;
        int sequences = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (checkHorizontal(dna, i, j) || checkVertical(dna, i, j) || checkDiagonal(dna, i, j)) {
                    sequences++;
                    if (sequences > 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}