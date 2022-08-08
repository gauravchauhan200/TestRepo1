package seleniumscript;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class AlertLearn
{	
	@Test(dataProvider="dp2")
	public  void test(String name, String pass, String usn)
	{
		System.out.println(name+"---"+pass+"---"+usn);
	}	
	
	@DataProvider(name="dp2")
	public Object[][] getData()
	{
		Object[][] data = {{"gc","123","1rn09cs036"},
							{"sam","235","1rn09cs098"},
							{"rahul","236","1rn09767"}};
		return data;
	}
	
}
