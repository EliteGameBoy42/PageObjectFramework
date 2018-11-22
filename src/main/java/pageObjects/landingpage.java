package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.print.DocFlavor;
import java.util.List;

public class landingpage {
    public WebDriver driver;

    public landingpage(WebDriver driver) {
        this.driver = driver;
    }
    By signIn = By.cssSelector("a[href*='sign_in']");
    By title = By.xpath("//div[@class='text-center']/h2");
    By navbar=By.cssSelector(".navbar-collapse.collapse");
    By popupclose=By.xpath("//*[text()='NO THANKS']");

    public WebElement getNavigationbar(){
        return driver.findElement(navbar);
    }


    public WebElement getLogin() {
        return driver.findElement(signIn);
    }
    public  WebElement getTitle(){
        return driver.findElement(title);
    }

    public  WebElement getPopupClose(){
        return driver.findElement(popupclose);
    }
    public int getPopupSize(){
        return driver.findElements(popupclose).size();
    }
}
