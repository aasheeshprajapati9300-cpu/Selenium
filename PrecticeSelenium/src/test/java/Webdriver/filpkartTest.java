package Webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class filpkartTest {
		@Test
		public void filpkartsTest() throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.flipkart.com/");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@data-observerid-7b37be0a-0628-43ad-8de8-f452bf56a6f2=\"276c2ccf-a580-4932-b23a-b5824fc83841\"]")).click();
			driver.quit();
		}
}
