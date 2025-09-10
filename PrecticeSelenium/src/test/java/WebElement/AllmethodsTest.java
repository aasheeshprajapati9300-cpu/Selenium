package WebElement;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AllmethodsTest {
	@Test
	public void WebElementTest() {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.flipkart.com/");
		WebElement s = d.findElement(By.name("q"));
		s.click();
		@SuppressWarnings("deprecation")
		String at = s.getAttribute("title");
		System.out.println(at);
	}
	
	@Test 
	public void cssValueTest() {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.flipkart.com/");
		String s = d.findElement(By.cssSelector("img[alt='Electronics']")).getCssValue("cursor");;
		System.out.println(s);
	}
	
	@Test 
	public void locationTest() {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.flipkart.com/");
		 Rectangle s = d.findElement(By.cssSelector("img[alt='Electronics']")).getRect();;
		//System.out.println(s.getLocation());
		System.out.println(s.getX()+" "+s.getY()+" "+s.height+" "+s.width);
	}
	
	
}
