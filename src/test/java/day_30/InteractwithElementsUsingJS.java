package day_30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractwithElementsUsingJS {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		
		//ChromeDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//JavascriptExecutor js=driver;
		
//enter name using JavascriptExecutor
		
		WebElement name=driver.findElement(By.xpath("//input[@id='name']"));
		js.executeScript("arguments[0].setAttribute('value','Girija')", name);
		
//click on radio button
		
		WebElement rd_female=driver.findElement(By.xpath("//input[@id='female']"));
		js.executeScript("arguments[0].click();", rd_female);
		
//click on checkbox
		
		WebElement day=driver.findElement(By.xpath("//input[@id='sunday']"));
		js.executeScript("arguments[0].click();", day);
		

		
	//Thread.sleep(5000);
	//driver.close();
	}

}
