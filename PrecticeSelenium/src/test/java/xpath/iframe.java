package xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class iframe {

	@Test
	public void ifameTest() throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://qa-automation-practice.netlify.app/iframe");
		//d.switchTo().frame(0);
		
		//d.switchTo().frame("iframe-checkboxes");
		d.switchTo().frame(d.findElement(By.id("iframe-checkboxes")));
		WebElement element = d.findElement(By.xpath("//h1[text()='Hello, this is an Iframe!']"));
	
		Thread.sleep(3000);
		System.out.println(element.getText());
		WebElement element2 = d.findElement(By.xpath("(//p[@class=\"lead\"])[1]"));
		System.out.println(element2.getText());
		d.switchTo().defaultContent();
		WebElement e3 = d.findElement(By.id("api-testing"));
		System.out.println(e3.getText());
	}
	
}
