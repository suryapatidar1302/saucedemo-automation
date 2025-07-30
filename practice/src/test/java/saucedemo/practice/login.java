package saucedemo.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


import pages.LoginPage;
import pages.homePage;

public class login extends base {
    @Test
    public void openSauceDemo() {
        driver.get("https://www.saucedemo.com/");
        System.out.println("Opened SauceDemo homepage!");
    }
    
    @Test
    public void testValidLogin()
    {
    	driver.get("https://www.saucedemo.com/");
    	LoginPage loginPage = new LoginPage(driver);
    	loginPage.login("standard_user", "secret_sauce");
    	
    	String expectedUrl = "https://www.saucedemo.com/inventory.html";
    	Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);
    	System.out.println("Opened after login!");

     }
    
    @Test
    public void testItemAddCart()
    {
    	driver.get("https://www.saucedemo.com/");
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
    	driver.get("https://www.saucedemo.com/");
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
