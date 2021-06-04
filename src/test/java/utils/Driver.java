package utils;

import org.apache.commons.lang3.SystemUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    private static WebDriver driver;

    public static WebDriver getDriver(){

        if(SystemUtils.IS_OS_MAC) {
            String driverPath = "src/test/java/utils/drivers/chromedriver_mac_91";
            System.setProperty("webdriver.chrome.driver", driverPath);
        } else if(SystemUtils.IS_OS_WINDOWS) {
            String driverPath = "src/test/java/utils/drivers/chromedriver_windows_91.exe";
            System.setProperty("webdriver.chrome.driver", driverPath);
        } else if(SystemUtils.IS_OS_LINUX) {
            String driverPath = "src/test/java/utils/drivers/chromedriver_linux_245";
            System.setProperty("webdriver.chrome.driver", driverPath);
        } else {
            System.out.println("************** OS Not supported **************");
        }

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
