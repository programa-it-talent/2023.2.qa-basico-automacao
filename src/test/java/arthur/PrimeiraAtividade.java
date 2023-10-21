package arthur;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrimeiraAtividade
{

    public void validationEmail(String inputEmail) {
        String requirement = "@";
        Assertions.assertTrue(inputEmail.contains(requirement));
    }

    @Test
    public void test(){
        this.validationEmail("arthurmottaguimraes@gmail.com");
    }
}
