package Academy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import resources.base;
import pageObjects.landingpage;

import java.io.IOException;

public class validateTitle extends base {
    public static Logger log = LogManager.getLogger(base.class.getName());

    @BeforeTest
    public void initialize()throws IOException {
        driver = initializeDriver();
        log.info("driver is initialized");
        driver.get(properties.getProperty("url"));
        log.info("Navigated to Home page");
    }
    @Test
    public void ValidateText() {
        landingpage landingPage = new landingpage(driver);
        String actual = landingPage.getTitle().getText();
        boolean navbar=landingPage.getNavigationbar().isDisplayed();
        Assert.assertEquals(actual, "FEATURED COURSES");
        Assert.assertTrue(navbar);
        log.info("Successfully validated text message");
         }

         @AfterTest
    public void tearDown(){
        driver.manage().deleteAllCookies();
        driver.close();
        driver=null;
        log.info("Browser is closed");
         }
}

