package saucedemo.practice;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ExtentManager;

import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class base {
  
	protected WebDriver driver;
	protected static ExtentReports extent;
    protected static ExtentTest test;

	
	@BeforeClass
	public void setup()
	{
		extent = ExtentManager.getInstance();
        test = extent.createTest(this.getClass().getSimpleName());
		System.out.println("Starting test class : "+this.getClass().getSimpleName());
	}
	
	@AfterClass
	public void tearDown()
	{
		extent.flush();
		System.out.println("Finished test class : "+this.getClass().getSimpleName());
	}
  
  @BeforeMethod
  public void beforeMethod() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.saucedemo.com/");
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
  	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name")));
  }

  @AfterMethod
  public void afterMethod() {
	  if(driver!=null)
	  {
		  driver.quit();
	  }
	  
  }

}
