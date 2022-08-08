package seleniumscript;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hash
{
	public static void main(String[] args) throws IOException 
	{
				
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement table = driver.findElement(By.xpath("(//table)[1]"));
		
		List <WebElement> a1  = driver.findElements(By.xpath("(//table)[1]//tr//td[1]"));
		List <WebElement> a2 = driver.findElements(By.xpath("(//table)[1]//tr//td[2]"));
		
		System.out.println("i m great");
		
		HashMap <Object,Object> map = new HashMap();
		
		for ( WebElement a : a1)	
		{	
			for (WebElement b: a2)
			{
				map.put(a.getText(), b.getText());
			}
			System.out.println(map);
		}
		
		for (Map.Entry<Object,Object> o: map.entrySet())
		{                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
			System.out.println(o.getKey()+ " " + o.getValue());
		}
			
		
		System.out.println("i m great");
		driver.close();	
		}
}
