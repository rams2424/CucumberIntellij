package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utility.Browserdriver;

public class LoginPage extends Browserdriver {



    private By usrname_input = By.xpath("//input[@id='usr']");
    private By pwd_input = By.xpath("//input[@id='pwd']");
    private By login = By.xpath("//input[@value='Login']");
    private By newReg = By.id("NewRegistration");

    public void sendkeys_usrname()
    {
        driver.findElement(usrname_input).sendKeys("scott.gale@gmail.com");
    }

    public void sendkeys_pwd()
    {
        driver.findElement(pwd_input).sendKeys("P@sword");
    }

    public void loginClick()
    {
        driver.findElement(login).click();
    }

    public void newRegClick()
    {
        driver.findElement(newReg).click();
    }
}
