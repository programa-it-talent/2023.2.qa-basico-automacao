package edmozer;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class Hooks {

    public WebDriver driver;

    @BeforeEach
    public void antesDaExec() { driver = BrowserFactory.getBrowser();}

    @AfterEach
    public void depoisDaExec() {
        driver.quit();
        driver = null;
    }
}
