package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Base {
	public static WebDriver driver;
	
	public static void navigationURL (String url) {
		driver.get(url);
	}
	
	public static void Click (By locator) {
		driver.findElement(locator).click();	
		}
	
	public static void SendKyes (By locator, String Value) {
		driver.findElement(locator).sendKeys(Value);
		}
	
	public static void clear (By locator) {
		driver.findElement(locator).clear();
	}
	
	public static String gettex (By locator) {
		String S=driver.findElement(locator).getText();
	return S;
	}
	
	public static String getAttributr (By locator,String Value) {
		String V= driver.findElement(locator).getAttribute(Value);
	return V;
	}
	
	public static void mouseHover (By locator) {
		WebElement WElement= driver.findElement(locator);
		Actions act= new Actions(driver);
		act.moveToElement(WElement).build().perform();
	}
}
