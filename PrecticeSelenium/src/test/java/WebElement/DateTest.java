package WebElement;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DateTest {
	@Test
	public void dateTest() throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://letcode.in/test");
		
		TakesScreenshot s = (TakesScreenshot) driver;
		File screen = s.getScreenshotAs(OutputType.FILE);
		
		driver.findElement(By.partialLinkText("Date & Time")).click();
		
		Actions a = new Actions(driver);
		
		a.scrollByAmount(0, 800);
		
		driver.findElement(By.id("birthday")).sendKeys("16042002");
		
		//WebElement s = driver.findElement(By.xpath("(//div[@class='card-content'])[1]"));
		
		
		File dest = new File("./Screenshot/pic1.png");
		 
		FileUtils.copyFile(screen, dest);
	
	
	}
}
