package diegoaquino;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Aula01Test {
    @Test
    @DisplayName("Cenario: Nome existente no array?")
    public void teste01(){
        String[] nomes = {"Diego", "Liane", "Mick", "Paulo" };
        String nomeExisteArray = "Mick";

        boolean nomeEncontrado = false;
        for (String nome : nomes) {
            if (nome.equals(nomeExisteArray)) {
                nomeEncontrado = true;
                break;
            }
        }
        Assertions.assertTrue(nomeEncontrado, "O nome " + nomeExisteArray + " não está presente no array.");
    }
}
