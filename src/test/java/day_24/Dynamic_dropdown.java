package day_24;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Changes the input related data dynamically .eg:Search in google :always the below related will change
public class Dynamic_dropdown {

	public static void main(String[] args) {
		
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://www.google.com/");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
//Input field X-path
	
	driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("Selenium");
	
//Find the total elements displayed aftr search
	
	List<WebElement> Totalelements=driver.findElements(By.xpath("//div[@class='wM6W7d'and@role='presentation']//span"));
	
	System.out.println("Total elements displaying:"+Totalelements.size()); //Total elements displaying:10
	
// display all elements
   /*	for(int i=0;i<Totalelements.size();i++)
	{
		System.out.println(Totalelements.get(i).getText()); //Display all element names
	}*/

//Retrive selenium testing from the List
	
	for(int i=0;i<Totalelements.size();i++)
	{
		String text=Totalelements.get(i).getText(); 
		
		if(text.equals("selenium testing"))
		{
			Totalelements.get(i).click();
			break;
		}
		
	}
	}

}
