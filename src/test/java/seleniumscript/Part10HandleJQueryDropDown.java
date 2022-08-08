package seleniumscript;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part10HandleJQueryDropDown 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		driver.findElement(By.xpath("//input[@id='justAnInputBox']")).click();
		//selectChoiceValues(driver,"choice1");
		//selectChoiceValues(driver,"choice1","choice2","choice 1 2");
		//selectChoiceValues(driver,"all");
	
		List<WebElement>choicesList= driver.findElements(By.xpath("//div[@id='comboTree149407DropDownContainer']//ul/li"));
		
		for(WebElement ele: choicesList)
		{
			ele.click();
		}
		
		System.out.println("-----Last line-----");
		Thread.sleep(3000);
		driver.quit();
	}
/*	
	public static void selectChoiceValues(WebDriver driver,String... value)
	{
		List<WebElement>choicesList= driver.findElements(By.xpath("//div[@id='comboTree149407DropDownContainer']//ul/li"));
		
		for(WebElement ele: choicesList)
		{
			System.out.println(ele.getText());
		}
				
	}
	*/

}
