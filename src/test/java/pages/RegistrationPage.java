package pages;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import utility.Browserdriver;

public class RegistrationPage extends Browserdriver {

    private By usrRegtxt = By.xpath("/html/body/center/h1");

    public void verifyUsrRegtxt()
    {
       String usrRtxt = driver.findElement(usrRegtxt).getText();
        Assertions.assertEquals("User Registration Page", usrRtxt);
    }

}
