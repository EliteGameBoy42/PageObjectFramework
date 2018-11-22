package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class portalHomepage {
    public WebDriver driver;

    public portalHomepage(WebDriver driver) {
        this.driver = driver;
    }

    By searchCourse = By.name("query");

    public WebElement getCourseSearch() {
        return driver.findElement(searchCourse);
    }

}
