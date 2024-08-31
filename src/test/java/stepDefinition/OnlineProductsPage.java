package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OnlineProductsPage {
    pages.OnlineProductsPage Opage = new pages.OnlineProductsPage();
    @When("User clicks on Formal shoes drop down")
    public void user_clicks_on_formal_shoes_drop_down() {

        Opage.clickformalShoeDropdown();
    }
    @Then("User should be able to view the products")
    public void user_should_be_able_to_view_the_products() {
        Opage.getformalshoe_firstvalue();
    }

}
