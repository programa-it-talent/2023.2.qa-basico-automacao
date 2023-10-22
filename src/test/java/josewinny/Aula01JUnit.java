package josewinny;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Aula01JUnit {
    public String input = "José";
    public String expected = "José Winny";
    @Test
    @DisplayName("Cenário - não é o José Winny")
    public void testIsntMyName() {
        Assertions.assertNotEquals(input,expected);
    }
}
