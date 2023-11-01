package mickhill;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class Hooks
{
    public static WebDriver driver;

    @BeforeEach
    public void antesDoTeste()
    {
        driver = BrowserFactory.getBrowser();
    }

    @AfterEach
    public void depoisDoTeste()
    {
        driver.quit();
        driver = null;
    }
}
