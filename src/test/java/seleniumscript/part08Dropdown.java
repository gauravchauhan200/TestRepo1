package seleniumscript;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class part08Dropdown 
{
	WebDriver driver;
	
	@Test
	public void test() throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.opencart.com/index.php?route=account/register");
	
		WebElement drpcountyEle	= driver.findElement(By.xpath("//select[@name='country_id']"));
		
		Select select = new Select(drpcountyEle);
		List<WebElement> allOptions = select.getOptions();
		
		for(WebElement option: allOptions)
		{
			if(option.getText().equals("Albania"))
			{
				option.click();
				break;
			}
		}
		
		
		
		Thread.sleep(5000);
		driver.quit();		
	}
	
	
	
}
