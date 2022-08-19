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

	public class Home extends BaseClass {
		
	    public Home(String browserProperties) {
	        super(browserProperties);
	        PageFactory.initElements(driver, this);
	    }

	    @FindBy(id="popin_tc_privacy_button")
	    WebElement cookieBtn;

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
	    public void verifyHomePageTitle(){
	        String Title =driver.getTitle();
	        Assert.assertEquals("Contorion: Der smarte Shop fürs Handwerk", Title);
	        Log.info("Home page title -" + Title);
	    }
	}
	


