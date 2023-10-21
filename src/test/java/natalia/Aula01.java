package natalia;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Aula01 {

   @Test
   public void teste01(){

       boolean letra = "natalia".contains("a");
       Assertions.assertTrue(letra);
   }


}

