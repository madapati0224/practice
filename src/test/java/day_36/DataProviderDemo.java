package day_36;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class DataProviderDemo {
	
	 WebDriver driver;
	
	 @BeforeClass
	public void setup() 
	{
		driver=new ChromeDriver();
	}
	@Test(dataProvider="logincredentials")
	public void login(String email,String pswd  )
	{
		driver.get("https://demo.nopcommerce.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(pswd);
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		String exp_title="nopCommerce demo store";
		String act_title=driver.getTitle();
		Assert.assertEquals(exp_title,act_title);
	}
	@AfterClass
	public void close()
	{
		driver.close();
	}
	
//----------passing the data by using Dataprovider annotation to @Test----------------------------
	
	@DataProvider(name="logincredentials")
String[][] loginData()
{
	String data[][]= {
		
			{"abc@gmail.com","test@123"},
			{"mgirija04@gmail.com","mgirija@123"},
			{"grija@gmail.com","test@12"},
			{"girija@gmail.com","test@1"},
			{"girija@gmail.com","test@3"}
			
	};
	return data;
}

}
