package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.Browserdriver;

public class HomePage extends Browserdriver {



    private By hamburger_menu_xpath = By.xpath("//input[@type='checkbox']");
    private By singIn_Link_LinkText = By.xpath("//li[text()='Sign In Portal']");
    private By online_ProductsLink = By.xpath("//li[text()='Online Products']");

    public void click_hamburger_menu() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
        Thread.sleep(2000);
        driver.findElement(hamburger_menu_xpath).click();

    }

    public void click_signin_link() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(singIn_Link_LinkText).click();

    }

    public void click_onlineProduct_link() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(online_ProductsLink).click();

    }


}