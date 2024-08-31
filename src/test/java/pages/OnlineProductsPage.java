package pages;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import utility.Browserdriver;

public class OnlineProductsPage extends Browserdriver {

    private By formalShoe_Dropdown = By.xpath("//i[@class='fa fa-angle-double-down formalshoedropdown']");

    private By webtable_formalshoe = By.xpath("//table[contains(@class,'formalshoetable')]");
    private By formalshoe_firstvalue = By.xpath("//table[contains(@class,'formalshoetable')]//tbody//tr[1]//td[1]");

    public void clickformalShoeDropdown() {
        driver.findElement(formalShoe_Dropdown).click();
    }

    public void getformalshoe_firstvalue()
    {
       String formalshoetext= driver.findElement(formalshoe_firstvalue).getText();
        Assertions.assertEquals("   Classic Cheltenham", formalshoetext);
    }

}
