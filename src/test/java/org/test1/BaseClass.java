package org.test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {
  public WebDriver driver;
	public void getDriver() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\eclipse-workspace\\FrameWork1\\Driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	}
	
	public void launchUrl(String Url) {
	driver.get(Url);
	}
	
	public void typeText(WebElement element, String data) {
		element.sendKeys(data);
	}
	public void butnClick(WebElement element) {
		element.click();
	}
	
	public void mouseHoverAction(WebElement target) {
		Actions a=new Actions(driver);
		a.moveToElement(target).perform();
	}

}
