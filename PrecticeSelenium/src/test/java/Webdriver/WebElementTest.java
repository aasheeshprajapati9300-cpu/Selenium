package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebElementTest {

	@Test
	public void launchTest() throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.flipkart.com/");
		WebElement s = d.findElement(By.cssSelector("img[alt=\"Minutes\"]"));
		s.click();
		System.out.println(d.getCurrentUrl());
	//	System.out.println(d.getPageSource());
		System.out.println(d.getTitle());
		System.out.println(d.getWindowHandle());
		System.out.println(d.getWindowHandles());
		d.navigate().back();
		Thread.sleep(3000);
		d.navigate().forward();
		d.close();
		
		
		
	}
}
