package Academy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.landingpage;
import resources.base;

import java.io.IOException;

public class validateNavbar extends base {
    public static Logger log = LogManager.getLogger(base.class.getName());
    @BeforeTest
    public void initialize()throws IOException{
        driver = initializeDriver();
        log.info("driver is initialized");
        driver.get(properties.getProperty("url"));
        log.info("Navigated to the url");
    }

    @Test
    public void validateNavigationbar(){
        landingpage landingPage = new landingpage(driver);
        boolean navbar=landingPage.getNavigationbar().isDisplayed();
        Assert.assertTrue(navbar);
        log.info("Validated the navigation bar");
         }


    @AfterTest
    public void tearDown(){
        driver.manage().deleteAllCookies();
        driver.close();
        driver=null;
        log.info("successfully closed the browser");
    }
}

