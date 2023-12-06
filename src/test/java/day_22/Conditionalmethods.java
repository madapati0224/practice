package day_22;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*Conditionalmethods:
 * isDisplayed()
 * isEnabled()
 * isSelected()-used for Radio buttons and checkboxes.Returns Boolean values
 */

public class Conditionalmethods {

	public static void main(String[] args) {
		
	//	System.setProperty("webdriver.driver.chrome","C:\\Users\\HP\\Downloads\\chromedriver-win64.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/register");
		
//isDisplayed()-Lets check Searchbox is displayed or avaliable
		
//	WebElement SearchBox=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
//	System.out.println(SearchBox.isDisplayed());//True
		
	  //OR
		
	boolean SearchBox=driver.findElement(By.xpath("//input[@id='small-searchterms']")).isDisplayed();//true
	System.out.println("SearchBox AVALIABLE:"+SearchBox);
	
//isEnabled()-Lets check weather we can able to enter the Text and search or not /Enabled or disabaled
	
	//WebElement SearchBoxEnable=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
	//System.out.println(SearchBoxEnable.isEnabled()); //true
	 
	 //OR
	
	boolean SearchBoxEnable=driver.findElement(By.xpath("//input[@id='small-searchterms']")).isEnabled();
	System.out.println("SearchBoxEnable :"+SearchBoxEnable);//true
	
//isSelected()
	WebElement male_rd=driver.findElement(By.xpath("//input[@id='gender-male']"));
	
	WebElement female_rd=driver.findElement(By.xpath("//input[@id='gender-female']"));
	
//Before selected
	System.out.println("Male button selected:"+male_rd.isSelected()); //false
	System.out.println("Female button selected:"+female_rd.isSelected());//false
	
//After selecting male radio button
	
	System.out.println("After selection of male radio button:");
	
	male_rd.click();
	System.out.println("Male button selected:"+male_rd.isSelected()); //True
	System.out.println("Female button selected:"+female_rd.isSelected());//false
	
//After selecting female radio button
	System.out.println("After selection of female radio button:");
	
	female_rd.click();
	System.out.println("Male button selected:"+male_rd.isSelected()); //false
	System.out.println("Female button selected:"+female_rd.isSelected());//True
	
	
	
	
	
		
		

	}

}
