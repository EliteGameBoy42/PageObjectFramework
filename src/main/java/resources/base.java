package resources;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Listeners;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class base {
    public static WebDriver driver = null;
    public Properties properties=null;
    public WebDriver initializeDriver() throws IOException {

        properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\syful\\eclipse-workspace\\firstFramework\\src\\main\\java\\resources\\data.properties");
        properties.load(fileInputStream);
        String browsername = properties.getProperty("browser");
        if (browsername.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\syful\\Downloads\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browsername.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "");
            driver = new FirefoxDriver();
        } else if (browsername.equalsIgnoreCase("Internet Explorer")) {
            System.setProperty("webdriver.ie.driver", "");
            driver = new InternetExplorerDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        return driver;
    }

    public void getScreenShot(String result)throws IOException {
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("C:\\Users\\syful\\eclipse-workspace\\firstFramework\\scrnshot\\"+result+"screenshot.png"));

    }}
