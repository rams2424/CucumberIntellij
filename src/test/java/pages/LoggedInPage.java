package pages;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import utility.Browserdriver;

public class LoggedInPage extends Browserdriver {

    private By formalshoeTxt = By.xpath("//div[@id='SmokeTests']//h3");
    private By sportsShoeTxt = By.xpath("//div[@id='RegressionTests']//h3");
    private By sneakersShoeTxt = By.xpath("//div[@id='VanguardTests']//h3");

    public void verifyformalshoetxt()
    {
        String Ftxt = driver.findElement(formalshoeTxt).getText();
        Assertions.assertEquals("Formal Shoes", Ftxt);

    }

    public void verifySportsshoetxt()
    {
        String Stxt = driver.findElement(sportsShoeTxt).getText();
        Assertions.assertEquals("Sports", Stxt);
    }

    public void verifySneakershoetxt()
    {
        String Sntxt =  driver.findElement(sneakersShoeTxt).getText();
        Assertions.assertEquals("Sneakers",Sntxt);
    }
}
