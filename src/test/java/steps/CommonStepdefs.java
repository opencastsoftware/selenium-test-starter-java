package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.HomepagePage;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

public class CommonStepdefs extends HomepagePage {

    @Given("I go to url {string}")
    public void i_go_to_url(String url) {
        getUrl(url);
    }


    @And("I select the {string} link")
    public void iSelectTheLink(String link) {
        clickLink(link);
    }

    @Then("I should be on the {string} page")
    public void iShouldBeOnThePage(String pageTitle) {
        assertPageTitle(pageTitle);
    }

    @Then("I click the Start now button")
    public void iClickTheButton() {
        clickButton("//*[@id=\"get-started\"]/a");
    }

    @When("I search for company {string} and view the company details")
    public void iSearchForCompany(String companyName) {
        driver.findElement(By.id("site-search-text")).sendKeys(companyName);
        driver.findElement(By.id("search-submit")).click();
        driver.findElement(By.linkText("GREGGS PLC")).click();
    }

//    dont delete
    @Then("I validate that the details are displayed")
    public void iValidateThatTheDetailsAreDisplayed(DataTable dataTable) {
        List<List<String>> data = dataTable.asLists(String.class);
        String CompanyStatusExpected = data.get(1).get(1);
        String CompanyTypeExpected = data.get(1).get(1);
        String IncorporatedExpected = data.get(3).get(1);


        System.out.println("CompanyStatus " + CompanyStatusExpected);
        System.out.println("CompanyType " + CompanyTypeExpected);

        String CompanyStatusActual = driver.findElement(By.id("company-status")).getText();
        String CompanyTypeActual = driver.findElement(By.id("company-type")).getText();
        String IncorporatedActual = driver.findElement(By.id("company-creation-date")).getText();

        Assert.assertEquals(CompanyStatusExpected, CompanyStatusActual);
        Assert.assertEquals(CompanyTypeExpected, CompanyTypeActual);
        Assert.assertEquals(IncorporatedExpected, IncorporatedActual);
    }
}
