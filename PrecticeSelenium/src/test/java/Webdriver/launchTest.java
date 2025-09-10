package Webdriver;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hpsf.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class launchTest {
	@BeforeSuite
	public void BS() {
		String date = new Date().toString().replace(':', '-');
		ExtentSparkReporter esp = new ExtentSparkReporter("./Report/File/pic"+date+".png");
		
		ExtentReports erp = new ExtentReports();
		
	
	}
	
	@Test
	public void allMethosTest() throws IOException{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		 Dimension size = driver.manage().window().getSize();
		 System.out.println(size);
		 System.out.println(size.height+" "+size.width);
		 
		 driver.navigate().to("https://letcode.in/droppable");
		 driver.navigate().refresh();
		
		//driver.manage().window().setPosition(new Point(600,300));
//		String title = driver.getTitle();
//		System.out.println(title);
		
//		String url = driver.getCurrentUrl();
//		System.out.println(url);
		
//	  System.out.println(driver.getPageSource());
		 
		WebElement drag =  driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		WebElement drop =  driver.findElement(By.xpath("//p[text()='Drop here']"));
		
		Actions a = new Actions(driver);

		a.dragAndDrop(drag, drop).perform();
		a.clickAndHold(drag).moveToElement(drop).release(drop).perform();
		
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandles());
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File ("./Screenshot/pic.png");
		
		FileUtils.copyFile(temp, destination);
		
	
		
		
	}

}
