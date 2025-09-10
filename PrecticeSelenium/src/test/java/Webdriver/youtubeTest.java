package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class youtubeTest {
	@Test
	public void youtubesTest() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		WebElement search = driver.findElement(By.name("search_query"));
		search.sendKeys("Dhun Song");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Dhun Song | Saiyaara | Ahaan Panday, Aneet Padda | Mithoon | Arijit Singh | In cinemas now")).click();
		
	}
			
}
