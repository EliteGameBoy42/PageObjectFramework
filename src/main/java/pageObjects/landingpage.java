package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingpage {
    public WebDriver driver;

    public landingpage(WebDriver driver) {
        this.driver = driver;
    }
    By signIn = By.cssSelector("a[href*='sign_in']");
    By title = By.xpath("//div[@class='text-center']/h2");
    By navbar=By.cssSelector(".navbar-collapse.collapse");

    public WebElement getNavigationbar(){
        return driver.findElement(navbar);
    }


    public WebElement getLogin() {
        return driver.findElement(signIn);
    }
    public  WebElement getTitle(){
        return driver.findElement(title);
    }

}
