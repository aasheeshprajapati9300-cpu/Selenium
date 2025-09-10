package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	
	@BeforeSuite
	public void BS() {
		
	}
	@BeforeClass
	public void BC() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		
	}
	@BeforeMethod
	public void BM() {
		
	}
	@AfterMethod
	public void AM() {
		
	}
	@AfterClass
	public void AC() {
		
	}
	@AfterSuite
	public void AS() {
		
	}

}
