package seleniumscript;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Clark
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		driver.get("https://clark.titusgt.com:10742/#/login");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Manni");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("manni");
		driver.findElement(By.xpath("//span[@class='ui-button-text ui-clickable']")).click();
		
		List <WebElement>elements = driver.findElements(By.xpath("//div[@class='ui-table-scrollable-body']//tr//td"));
		System.out.println("Size of list ------>  : "+elements.size());
		for(WebElement ele :elements)
		{System.out.println(ele.getText());}
		
		Thread.sleep(3000);
		driver.quit();
	}
}
