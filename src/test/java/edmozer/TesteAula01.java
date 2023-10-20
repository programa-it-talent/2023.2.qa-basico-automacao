package edmozer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TesteAula01 {
    @Test

    public void teste01(){
        boolean nome = "Edmozer".contains("Edmozer");
        Assertions.assertTrue(nome);
    }
}
