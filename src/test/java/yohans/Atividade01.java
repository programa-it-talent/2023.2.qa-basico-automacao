package yohans;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Atividade01 {
    private boolean isLegalAge(int yearsOld){
        return yearsOld >= 18;
    }

    @Test
    public void isGreaterOrEqualThan18(){
        Assertions.assertTrue(isLegalAge(18));
        Assertions.assertTrue(isLegalAge(19));
        Assertions.assertFalse(isLegalAge(17));
    }
}
