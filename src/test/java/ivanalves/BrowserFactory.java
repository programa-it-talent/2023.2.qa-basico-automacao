package ivanalves;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {
    public static WebDriver getBrowser() {
    	
        WebDriver navegador;
        ChromeOptions options;

        WebDriverManager.chromedriver().setup();
        options = new ChromeOptions();

        options.addArguments(("--disable-crash-reporter"));
        options.addArguments(("--disable-extensions"));
        options.addArguments(("--disable-dev-shm"));
        options.addArguments(("--disable-notifications"));
        options.addArguments("start-maximized");
        
        navegador = new ChromeDriver(options);
        return navegador;
    }
    
    
}