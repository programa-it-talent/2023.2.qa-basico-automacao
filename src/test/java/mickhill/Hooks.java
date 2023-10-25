package mickhill;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class Hooks {
    WebDriver driver = BrowserFactory.getBrowser();

    @BeforeEach
    public void antesDoTeste() {
        driver.get("https://google.com.br");
    }

    @AfterEach
    public void depoisDoTeste() {
        driver.quit();
        driver = null;
    }
}
