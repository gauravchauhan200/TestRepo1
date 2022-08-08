package seleniumscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;



public class ActionMouseOver
{
	public static void main(String args[]) throws InterruptedException
	{
	

		WebDriverManager.chromedriver().setup();
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		driver.get("https://www.way2automation.com/");
		WebElement resource = driver.findElement(By.xpath("//*[text()='Resources']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(resource).perform();
		

		Thread.sleep(3000);
		
		
		System.out.println("End linePrint ");		
		
		driver.quit();
		
		
	}
	
}
