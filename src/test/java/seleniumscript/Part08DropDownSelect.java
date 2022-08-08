package seleniumscript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part08DropDownSelect 
{

	public static void main(String args[]) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://mvnrepository.com/artifact/org.apache.maven.plugins/maven-compiler-plugin/3.10.1");
		
		Thread.sleep(20);
		
		driver.quit();
	}
}
