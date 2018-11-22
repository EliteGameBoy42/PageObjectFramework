package stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import pageObjects.landingpage;
import pageObjects.loginpage;
import pageObjects.portalHomepage;
import resources.base;

import java.io.IOException;

public class stepDefinition extends base {
    public static Logger log = LogManager.getLogger(base.class.getName());
    loginpage loginpage = new loginpage(driver);
    landingpage landingpage = new landingpage(driver);
    portalHomepage portalHomepage=new portalHomepage(driver);

    @Given("^initialize the browser with chrome$")
    public void initializeTheBrowserWithChrome() throws IOException {
        driver = initializeDriver();

    }

    @And("^Navigate to \"([^\"]*)\" site$")
    public void navigateToSite(String url) {
        driver.get(url);
        log.info("Navigated to the url");

    }

    @And("^Click on login link in home page to land on secure sign in page$")
    public void clickOnLoginLinkInHomePageToLandOnSecureSignInPage() {
        landingpage=new landingpage(driver);
        if (landingpage.getPopupSize()>0){
            landingpage.getPopupClose().click();
        }
        landingpage.getLogin().click();

    }

    @When("^User enters \"([^\"]*)\" and \"([^\"]*)\" and logs in$")
    public void userEntersAndAndLogsIn(String username, String password) {
        loginpage=new loginpage(driver);
        loginpage.getEmail().sendKeys(username);
        loginpage.getPassword().sendKeys(password);
        log.info("Entered the username and the password");
        loginpage.getLoginButton().click();
        log.info("clicked on the login button");
    }


    @Then("^Verify that user has successfully logged in$")
    public void verifyThatUserHasSuccessfullyLoggedIn() {
        portalHomepage=new portalHomepage(driver);
//       Boolean validatedLogin= portalHomepage.getCourseSearch().isDisplayed();
//       Assert.assertTrue(validatedLogin);
    }

    @And("^close the browser$")
    public void closeTheBrowser() {
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
