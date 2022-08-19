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

public class SearchText extends BaseClass {
    public SearchText(String browserProperties) {
        super(browserProperties);
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(id="search-input")
    WebElement search_bar;
    
    @FindBy(id="search-button")
    WebElement search_button;
    
    @FindBy(xpath="//span[contains(text(),'hammer')]")
    WebElement search_result;
  

    public void validateSearch(String text1) {
    	
    	Log.info("Start - validateSearch");
    	
    	sleep(1000);

        String searchText = text1;
        Log.info("Enter the searchtext");
        search_bar.sendKeys(searchText);
        Log.info("Click seek button");
        search_button.click();
        sleep(3000);
        String text =search_result.getText();
        Log.info("Confirm search text-" +text);
       // System.out.println("Confirm search text-\" +text);
        Assert.assertEquals(searchText, text);
        
    	Log.info("End - validateSearch");

    }
}
