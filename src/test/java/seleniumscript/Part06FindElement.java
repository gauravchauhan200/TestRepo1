package seleniumscript;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part06FindElement 
{
	WebDriver driver;
	
	@Test
	public void test() throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		WebElement emailbox = driver.findElement(By.xpath("//input[contains(@class,'id')]"));
		emailbox.clear();
		Thread.sleep(2000);
		emailbox.sendKeys("rahul Arora");
		WebElement pass= driver.findElement(By.xpath("//input[contains(@class,'ssw')][starts-with(@id,'Pass')]"));
		pass.clear();
		Thread.sleep(2000);
		pass.sendKeys("123456");
		
		
		WebElement	login= driver.findElement(By.xpath("//button[@class='button-1 login-button']"));
		String valueOfType= login.getAttribute("type");
		System.out.println(valueOfType);
		System.out.println(login.getText());
		
		Thread.sleep(3000);
		driver.quit();
	}

	
}
