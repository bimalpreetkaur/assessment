package Tests;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import library.Home;
import library.Login;
import library.SearchText;

public class Test1 extends Login {

    String Properties = "testdata.properties";
    Home obj;
    Login obj1;
    SearchText obj2;
    String Email =property.getProperty("username");
    String Password = property.getProperty("password");
    String SearchText = property.getProperty("searchtext");
    public Test1() {
        super("testdata.properties");
    }


    @BeforeMethod
    public void setUp() {
        initialization();
        obj = new Home(Properties);
        obj1 = new Login(Properties);
        obj2 = new SearchText(Properties);
    }

    @Test
    public void verifyPageTitle() {
        obj.acceptCookies();
        obj.verifyHomePageTitle();
    }

    @Test(dependsOnMethods = { "verifyPageTitle" })
    public void testLogin() {
        obj1.verifyLogin(Email, Password);
        obj2.validateSearch(SearchText);
    }
    
    @AfterMethod
    public void Close() {
        driver.close();
    }
}
