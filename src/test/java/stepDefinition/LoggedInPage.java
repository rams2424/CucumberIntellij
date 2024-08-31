package stepDefinition;

import io.cucumber.java.en.Then;
import pages.OnlineProductsPage;

public class LoggedInPage {

    @Then("User should be able to to see product details page")
    public void User_should_be_able_to_to_see_product_details_page(){
        pages.LoggedInPage OPage = new pages.LoggedInPage();
        OPage.verifyformalshoetxt();
        OPage.verifySneakershoetxt();
        OPage.verifySportsshoetxt();
    }
}
