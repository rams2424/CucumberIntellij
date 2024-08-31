package stepDefinition;

import io.cucumber.java.en.Given;
import io.qameta.allure.Allure;
import lombok.SneakyThrows;
import pages.HomePage;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;


public class HomePageStepDef {
    HomePage HP = new HomePage();

    @SneakyThrows
    @Given("User navigates to the login page")
    public void User_navigates_to_the_login_page()  {
        HP.click_hamburger_menu();
        HP.click_signin_link();
    }

    @SneakyThrows
    @Given("User navigates to the online product page")
    public void user_navigates_to_the_online_product_page()  {
        HP.click_hamburger_menu();
        HP.click_onlineProduct_link();
    }


}
