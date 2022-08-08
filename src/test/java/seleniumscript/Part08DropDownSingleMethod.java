package seleniumscript;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Part08DropDownSingleMethod 
{
	static WebDriver driver;

		public static void main(String args[]) throws InterruptedException
		{	
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.opencart.com/index.php?route=account/register");
			
			WebElement countrydrp = driver.findElement(By.xpath("//select[@name='country_id']"));
			selectOptionFromDropDown(countrydrp,"Cuba");
			
			Thread.sleep(3000);
			driver.quit();
			
		}	
			public static void selectOptionFromDropDown(WebElement ele,String value)
			{
				Select select = new Select(ele);
				List<WebElement> allOptions = select.getOptions();
			
				for(WebElement option: allOptions)
				{
					if(option.getText().equals(value))
					{
						option.click();
						break;
					}
				}
			}
}
