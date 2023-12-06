package day_34;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

/*
 * Testcase
 * 1.Openapp
 * 2.Login
 * 3.Closeapp
 */

public class SecondTest {
	WebDriver driver;
	
	//@BeforeClass
	@Test(priority=1)
	public void Openapp()
	{
	driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(priority=20)
	public void Login()
	{
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	//@AfterClass
	@Test(priority=30)
	public void Closeapp()
	{
		driver.close();
	}

}
