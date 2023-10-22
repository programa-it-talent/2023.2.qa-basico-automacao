package josewinny;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Aula01JUnit {
    public String input = "José";
    public String expected = "José Winny";
    @Test
    @DisplayName("Cenário - não é igual ao meu nome")
    public void testIsntEqualsToMyName() {
        Assertions.assertNotEquals(input,expected);
    }
    @Test
    @DisplayName("Cenário - contém parte do meu nome")
    public void testContainsOnMyName(){
        Assertions.assertTrue(expected.contains(input));
    }
}
