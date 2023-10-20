package amitair;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Aula01 {

    @Test
    public void testStringContainsSubstring() {
        String input = "Amitair";
        String substring = "mit";
        Assertions.assertTrue(input.contains(substring));
    }
}

