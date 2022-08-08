package seleniumscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionSlider
{

	public static void main(String args[]) throws InterruptedException
	{
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://jqueryui.com/slider/");
		driver.switchTo().frame(0);
		
		WebElement mainSlider = driver.findElement(By.xpath("//*[@id='slider']"));
		WebElement slider = driver.findElement(By.xpath("//*[@id='slider']/span"));
		
		Actions action = new Actions(driver);
		action.dragAndDropBy(slider, mainSlider.getSize().width/2, 0).perform();
		
		
		
		
		Thread.sleep(30);
		
		driver.quit();
		
	}
}
