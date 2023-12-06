package day_26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_using_SwitchTo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		driver.manage().window().maximize();
		
//----------------------------------frame1-----------------------------------------------------
		
	WebElement frame1=	driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
	
	driver.switchTo().frame(frame1); //switch to frame1
	
	driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("smoketesting");
	
	driver.switchTo().defaultContent();//switch the main page
	
//----------------------------Frame2----------------------------------------------------------------
	WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
	
	driver.switchTo().frame(frame2);//switch to frame2
	
	driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("SanityTesting");
	
	driver.switchTo().defaultContent();//switch the main page
	
//--------------------------Frame3 which has inner frame/iframe----------------------------------------------
	WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
	
	driver.switchTo().frame(frame3);//switch to frame3
	
	driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("SystemTesting");
	
	//---------------iframe--------When we have single iframe then use index-------------------------------------------
	
	driver.switchTo().frame(0);
	 
	driver.findElement(By.xpath("//*[@id='i8']/div[3]/div")).click(); //click on radiobutton
	
	driver.switchTo().defaultContent();//switch the main page
	
	//--------------------------frame4---------------------------------------------------------------------
	
	WebElement frame4=driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
	  
	driver.switchTo().frame(frame4);
	
	driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("RegressionTesting");
	
	
	
	
	
	
	

	}

}
