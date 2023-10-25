package mickhill;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class Hooks {
    public WebDriver driver = BrowserFactory.getBrowser();

    @BeforeEach
    public void antesDoTeste() {
    }

    @AfterEach
    public void depoisDoTeste() {
        driver.quit();
        driver = null;
    }
}
