package library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import utilities.BaseClass;
import utilities.Log;

public class Login extends BaseClass {
    public Login(String browserProperties) {
        super(browserProperties);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="popin_tc_privacy_button")
    WebElement cookies_button;

    @FindBy(xpath="//span[contains(text(),'Anmelden')]")
    WebElement Register_option;

    @FindBy(id="login_email")
    WebElement userName_textbox;

    @FindBy(id="login_password")
    WebElement password_textbox;

    @FindBy(xpath="//span[contains(text(),'Jetzt anmelden')]")
    WebElement login_button;

    @FindBy(xpath="//div[contains(text(),'Du bist nun bei Contorion angemeldet.')]")
    WebElement confirm_message;
    
    public boolean isHomePageLoaded() {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        return wait.until(
                ExpectedConditions.presenceOfElementLocated(By.id("popin_tc_privacy_button"))).isDisplayed();
    }
    public void acceptCookies(){
        if(isHomePageLoaded()==true)
        {
            driver.findElement(By.id("popin_tc_privacy_button")).click();
            Log.info("Cookies are accepted from home page");
        }
        else
        {
        	Log.info("Home page is not loaded successfully");
        }
    }

    
    public void verifyLogin(String Email, String Password) {
    	
    	Log.info("Start - verifyLogin");
    	
        String uname = Email;
        String pwd = Password;
        acceptCookies();
        sleep(3000);
        Log.info("Click on register");
        Register_option.click();
        sleep(3000);
        Log.info("Enter email id");
        userName_textbox.sendKeys(uname);
        Log.info("Enter password");
        password_textbox.sendKeys(pwd);
        Log.info("Click on login button");
        login_button.click();
        sleep(5000);
        String message = confirm_message.getText();
        Log.info("Login confirmation message- "+message);
        Assert.assertEquals("Du bist nun bei Contorion angemeldet.", message);
        
        Log.info("End - verifyLogin");
       // System.out.println("Login confirmation message- " + message);

    }
}