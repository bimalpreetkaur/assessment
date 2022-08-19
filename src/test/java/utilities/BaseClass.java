package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.apache.log4j.xml.DOMConfigurator;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseClass {
    public static WebDriver driver;
    public static Properties property;


    public BaseClass(String browserProperties){
    	DOMConfigurator.configure("log4j.xml");
        try {
            property = new Properties();
            FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/resources/config/"
                    + browserProperties);
            property.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public  void initialization(){
        String browserName = property.getProperty("browser");
        String driverName = property.getProperty("driver");
        Log.info("Browser name-" + browserName + " DriverName- " + driverName);
        Log.info(System.getProperty("user.dir")+"/src/main/resources/drivers/" + driverName);
        if(browserName.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/main/resources/drivers/" + driverName);
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        else if(browserName.equals("firefox")){
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/src/main/resources/drivers/" + driverName);
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
        }

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(GenerateScreenshot.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(GenerateScreenshot.IMPLICIT_WAIT, TimeUnit.SECONDS);

        driver.get(property.getProperty("url"));

    }

    public void sleep(int time) {
        try {
            Thread.sleep(time);
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
}
