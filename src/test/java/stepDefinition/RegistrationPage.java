package stepDefinition;


import io.cucumber.java.en.Then;

public class RegistrationPage {

    pages.RegistrationPage RP = new pages.RegistrationPage();

    @Then("User should be able to view the Registration page")
    public void User_should_be_able_to_view_the_Registration_page() {
        RP.verifyUsrRegtxt();
    }
}
