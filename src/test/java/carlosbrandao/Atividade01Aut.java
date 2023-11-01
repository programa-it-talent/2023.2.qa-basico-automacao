package carlosbrandao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Atividade01Aut {

    @Test
    @DisplayName("cenario: compara string")
    public void testebasico() {

        boolean r = ("ItTalent").contains("tT");

        Assertions.assertTrue(r);
    }
}
