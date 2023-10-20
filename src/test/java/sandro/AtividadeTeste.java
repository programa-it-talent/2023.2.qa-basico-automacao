package sandro;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AtividadeTeste {
    @Test
    public void teste01(){
        int resultado = 1 + 1;
        String sandro = "";

        if (resultado == 2){
            sandro = "lindo";
        }else{
            sandro = "feio";
        }

        Assertions.assertEquals(sandro, "lindo");
    }
}
