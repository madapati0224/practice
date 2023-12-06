package day_31;

import java.io.File;
import java.time.Duration;
import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class CaptureScreenshot {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//Capture full page screenshot - selenium 3 & 4
		/*TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("D:\\Users\\HP\\eclipse-workspace\\SeleniumProject\\Screenshot\\fullpage.png");
		Files.copy(src,trg ); 
		 */
		
		// capture screenshot of specific area from webpage -- selenium 4+
		
		WebElement featuredproducts=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		
		File src=featuredproducts.getScreenshotAs(OutputType.FILE);
		File trg=new File("D:\\Users\\HP\\eclipse-workspace\\SeleniumProject\\Screenshot\\featuredproducts.png");
		Files.copy(src,trg ); 
		
		
		// capture screenshot of specific Web element -- selenium 4+
		
		/*	WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		
			File src=logo.getScreenshotAs(OutputType.FILE);
			File trg=new File("D:\\Users\\HP\\eclipse-workspace\\SeleniumProject\\Screenshot\\logo.png");
			Files.copy(src,trg ); */

	}

}
