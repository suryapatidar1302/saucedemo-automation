package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class homePage {
	
	private WebDriver driver;
	
	private By addToCartButton = By.id("add-to-cart-sauce-labs-backpack");
	private By cartBadge = By.className("shopping_cart_badge");
    private By menuButton = By.id("react-burger-menu-btn");
    private By logoutLink = By.id("logout_sidebar_link");
    
	public homePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void addItemToCart() {
        driver.findElement(addToCartButton).click();
    }
	
	public boolean cartBadge() {
		return driver.findElement(cartBadge).isDisplayed();
	}
	
	public void logout() {
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait1.until(ExpectedConditions.elementToBeClickable(menuButton));
		
		driver.findElement(menuButton).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(logoutLink));
        
		driver.findElement(logoutLink).click();
	}
	

}
