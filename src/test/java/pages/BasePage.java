package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Driver;

public class BasePage extends Driver {

    protected WebDriver driver = Driver.getDriver();

    public void getUrl(final String url) {
        driver.navigate().to(url);
    }

    public void assertPageTitle(String pageTitle) {
        String currentTitle = driver.getTitle();
        System.out.println("current title:" + currentTitle );
        Assert.assertTrue(currentTitle.contains(pageTitle));
    }

    public void clickLink(String link) {
        driver.findElement(By.linkText(link)).click();
    }

    public void clickButton(String xpath) {
        driver.findElement(By.xpath(xpath)).click();
    }

}
