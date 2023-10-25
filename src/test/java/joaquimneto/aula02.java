package joaquimneto;

import mickhill.Hooks;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class aula02 extends Hooks
{
    @Test
    @DisplayName("Cenario: usando o navegador")
    public void teste02() throws InterruptedException
    {
        driver.get("https://www.xbox.com/pt-br/play");
        Thread.sleep(5000);
    }
}
