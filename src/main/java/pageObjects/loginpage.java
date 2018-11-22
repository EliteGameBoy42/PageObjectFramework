package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
    public WebDriver driver;

    public loginpage(WebDriver driver) {
        this.driver = driver;
    }
    By email = By.id("user_email");
    By password = By.id("user_password");
    By go = By.name("commit");
    By failedlogin=By.cssSelector("alert alert-danger");
    public WebElement getEmail() {
        return driver.findElement(email);
    }

    public WebElement getPassword() {
        return driver.findElement(password);
    }

    public WebElement getLoginButton() {
        return driver.findElement(go);
    }
    public WebElement failedLogin(){
        return driver.findElement(failedlogin);
    }
}
