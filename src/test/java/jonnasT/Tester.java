package jonnasT;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Tester {

    @Test
    public void testNomeProprio() {
        String a = "Mick";
        String b = "Hill";
        String result = a + b;
        assertEquals("mickhill", result, "A concatenação de 'mick' e 'hill' deve ser 'mickhill'");
    }
}
