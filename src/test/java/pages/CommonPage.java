package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Driver;

public class CommonPage extends Driver {

    public static void getUrl(final String url) {
        driver.navigate().to(url);
    }

}
