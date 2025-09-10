package xpath;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class xpathasixTest {
	@Test
	public void byaxisTest() throws IOException, InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://demowebshop.tricentis.com/");
		d.findElement(By.id("small-searchterms")).sendKeys("Computer");
		d.findElement(By.xpath("//input[@id=\"small-searchterms\"]/following-sibling::input")).click();
		d.findElement(By.xpath("(//input[@value=\"Add to cart\"])[1]")).click();
		d.findElement(By.id("add-to-cart-button-72")).click();
		Thread.sleep(3000);
		WebElement element = d.findElement(By.xpath("//div[@class=\"bar-notification success\"]"));
		
		File temp =element.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/pic3.png");
		FileUtils.copyFile(temp, dest);
		
   }
}
