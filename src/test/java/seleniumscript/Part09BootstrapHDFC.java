package seleniumscript;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part09BootstrapHDFC 
{
	public static void main(String args[]) throws InterruptedException
	{			
	WebDriverManager.chromedriver().setup();
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--disable-notifications");
	WebDriver driver = new ChromeDriver(option);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.hdfcbank.com/");
	
	driver.findElement(By.xpath("//a[text()='Select Product Type']")).click();
	List<WebElement>prodType= driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
	selectDropDown(prodType,"Vehicle Insurance");
	
	
	driver.findElement(By.xpath("//a[text()='Select Product']")).click();
	List<WebElement> selProd= driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']/li"));
	selectDropDown(selProd,"Two Wheeler Insurance");
	
			
	System.out.println("-------End of Script-------");
	Thread.sleep(4000);
	driver.quit();
	}
	
	public static void selectDropDown(List<WebElement> drplist,String str)
	{	
		for(WebElement ele : drplist)
		{
			if(ele.getText().equals(str))
			{
				ele.click();
				break;
			}
		}		
	}
	
	
}
