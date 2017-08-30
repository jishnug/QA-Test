package util;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import pages.HomePage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import static com.sun.activation.registries.LogSupport.log;

public class BrowserFactory {
    public static BrowserFactory wcon = null;
    public WebDriver driver = null;
    public WebDriver mozilla = null;
    public WebDriver chrome = null;
    public WebDriver ie = null;
    public Properties config = null;

    private BrowserFactory() {

        try {
            if (config == null) {
                config = new Properties();
                FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\config\\config.properties");
                config.load(fis);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void openBrowser(String browserType) {

        if (browserType.equalsIgnoreCase("mozilla") && mozilla == null) {
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\src\\main\\java\\drivers\\geckodriver.exe");
            driver = new FirefoxDriver();
            mozilla = driver;
        } else if (browserType.equalsIgnoreCase("mozilla") && mozilla != null) {
            driver = mozilla;
        }
        if (browserType.equalsIgnoreCase("chrome") && chrome == null) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\java\\drivers\\chromedriver.exe");
            driver = new ChromeDriver();
            chrome = driver;
        } else if (browserType.equalsIgnoreCase("chrome") && chrome != null) {
            driver = chrome;
        }
        if (browserType.equalsIgnoreCase("ie") && ie == null) {
            System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\src\\main\\java\\drivers\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
            ie = driver;
        } else if (browserType.equalsIgnoreCase("ie") && ie != null) {
            driver = ie;
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public HomePage openUrl(String url)
    {

        driver.get(config.getProperty(url));
        return new HomePage();
    }
    public static BrowserFactory getInstance() {
        if (wcon == null)
            wcon = new BrowserFactory();
        return wcon;
    }


    public void close()
    {

        driver.quit();
    }


    public void takeScreenShot()
    {

        Date d=new Date();
        String screenShotFile=d.toString().replace(":","_").replace(" ","_")+".png";
        String filePath=PageConstants.REPORTS_PATH+screenShotFile;
        File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(srcFile, new File(filePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void reportFailure(String failureMessage)
    {
        takeScreenShot();
        Assert.fail(failureMessage);

    }

}
