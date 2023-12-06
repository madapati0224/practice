package day_22;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsermethods {

	public static void main(String[] args) throws InterruptedException {
		
		
      WebDriver driver =new ChromeDriver();
       
       driver.get("https://opensource-demo.orangehrmlive.com/");
       driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    
    Thread.sleep(2000);
    driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
    Thread.sleep(2000);
    
    //driver.close(); //Will close 1st window
    driver.quit();// close all windows
    
	}

}
