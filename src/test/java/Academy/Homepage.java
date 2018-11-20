package Academy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.landingpage;
import pageObjects.loginpage;
import resources.base;

import java.io.IOException;

public class Homepage extends base {
    public static Logger log = LogManager.getLogger(base.class.getName());
    @BeforeTest
    public void initialize()throws IOException {
        driver = initializeDriver();
        log.info("driver is initialized");
    }


    @Test(dataProvider = "getData")
    public void validateLoginFunction(String username, String password, String text) throws IOException {
        driver.get(properties.getProperty("url"));
        log.info("Navigated to the url");
        landingpage landingpage = new landingpage(driver);
        landingpage.getLogin().click();
        loginpage loginpage = new loginpage(driver);
        loginpage.getEmail().sendKeys(username);
        loginpage.getPassword().sendKeys(password);
        log.info("Entered the username and the password");
        loginpage.getLoginButton().click();
        log.info("clicked on the login button");
        System.out.println(text);
        log.info("Browser is reopening for the second testcase");

    }
    @DataProvider
    public Object[][] getData() {
        Object[][] data = new Object[2][3];

        data[0][0] = "syfulislam42@gmail.com";
        data[0][1] = "123456";
        data[0][2] = "restricted user";

        data[1][0] = "syfulislam41@gmail.com";
        data[1][1] = "654321";
        data[1][2] = "NonRestricted user";

        return data;
    }

    @AfterTest
    public void tearDown(){
        driver.manage().deleteAllCookies();
        driver.close();
        driver=null;
    }
}
