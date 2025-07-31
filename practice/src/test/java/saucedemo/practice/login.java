package saucedemo.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import pages.LoginPage;
import pages.homePage;

public class login extends base {
    @Test
    public void openSauceDemo() {
        //driver.get("https://www.saucedemo.com/");
        System.out.println("Opened SauceDemo homepage!");
    }
    
    @Test
    @Parameters({"username","password"})
    
    public void testValidLogin(String username,String password)
    {
    	//driver.get("https://www.saucedemo.com/");
    	LoginPage loginPage = new LoginPage(driver);
    	loginPage.login(username,password);
    	
    	String expectedUrl = "https://www.saucedemo.com/inventory.html";
    	Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);
    	System.out.println("Opened after login!");

     }
    
    //testing with multiple users
    @DataProvider(name="loginUsers")
    public Object[][] loginUsers(){
    	return new Object[][] {
    		{"standard_user","secret_sauce"},
    		{"problem_user", "secret_sauce"},
            {"performance_glitch_user", "secret_sauce"}
    	};
    }
    
    @Test(dataProvider="loginUsers")
    public void testMultipleData(String username,String password)
    {
    	LoginPage loginPage = new LoginPage(driver);
    	loginPage.login(username, password);
    	
    	String expectedUrl = "https://www.saucedemo.com/inventory.html";
    	Assert.assertEquals(driver.getCurrentUrl(),expectedUrl,"Login failed for user"+username);
    }
    
    @Test
    public void testItemAddCart()
    {
    	//driver.get("https://www.saucedemo.com/");
    	LoginPage loginPage = new LoginPage(driver);
    	loginPage.login("standard_user","secret_sauce");
    	
    	homePage homepage = new homePage(driver);
    	homepage.addItemToCart();
    	
    	Assert.assertTrue(homepage.cartBadge(),"Item not added to cart");
    	System.out.println("Adding Cart method run");
    }
    
    @Test
    public void testLogout()
    {
    	//driver.get("https://www.saucedemo.com/");
    	LoginPage loginPage = new LoginPage(driver);
    	loginPage.login("standard_user","secret_sauce");

    	homePage homepage = new homePage(driver);
    	homepage.logout();
    	System.out.println("Logout done");
    
    	String expectedUrl = "https://www.saucedemo.com/";
    	Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);
    	System.out.println("On home page again");
    }
    
}
