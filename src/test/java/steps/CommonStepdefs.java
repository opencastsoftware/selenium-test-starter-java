package steps;

import io.cucumber.java.en.*;
import pages.HomepagePage;

public class CommonStepdefs extends HomepagePage {

    @Given("I go to url {string}")
    public void i_go_to_url(String url) {
        getUrl(url);
    }


    @And("I select the {string} on the menu bar")
    public void iSelectTheLinkOnTheMenuBar(String link) {
        clickLink(link);
    }

    @Then("I should be on the {string} page")
    public void iShouldBeOnTheClientsPage(String pageTitle) {
        assertPageTitle(pageTitle);
    }


}
