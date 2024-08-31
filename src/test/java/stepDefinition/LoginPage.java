package stepDefinition;

import io.cucumber.java.en.When;

public class LoginPage {

    pages.LoginPage LP = new pages.LoginPage();
    @When("User successfully enter the login in details")
    public void User_successfully_enter_the_login_in_details()
    {
    LP.sendkeys_usrname();
    LP.sendkeys_pwd();
    LP.loginClick();
    }

    @When("User clicks on new Registration button")
    public void User_clicks_on_newRegistrationbutton()
    {
        LP.newRegClick();
    }

}
