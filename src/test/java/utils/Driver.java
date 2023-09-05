package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    protected static WebDriver driver = getDriver();

    protected static WebDriver getDriver() {

        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        Runtime.getRuntime().addShutdownHook(new Thread("Driver shutdown thread") {
            public void run() {
                driver.quit();
            }
        });

        return driver;
    }
}
