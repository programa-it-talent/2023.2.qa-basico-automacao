package Jonnas;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserFactory
{
    public static WebDriver getBrowser()
    {
        //variaveis necessárias
        WebDriver navegador;
        ChromeOptions options;

        //Webdriver do chrome
        WebDriverManager.chromedriver().setup();
        options = new ChromeOptions();

        //Inicio
        options.addArguments(("--disable-crash-reporter"));
        options.addArguments(("--disable-extensions"));
        options.addArguments(("--disable-dev-shm"));
        options.addArguments(("--disable-notifications"));

        navegador = new ChromeDriver(options);
        navegador.manage().window().maximize();
        return navegador;
    }
}
