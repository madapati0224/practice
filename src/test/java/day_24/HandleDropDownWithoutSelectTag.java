package day_24;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDropDownWithoutSelectTag {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		
		driver.manage().window().maximize();
		
//clicking  Dropdown element xpath
		 
		driver.findElement(By.xpath("//button[contains(@class,'multiselect') ]")).click();
		
//Totan no.of elements
		
	List<WebElement> totalelemts=driver.findElements(By.xpath("//ul[contains(@class,multiselect)]//label"));
	System.out.println("Total no.of elements present in dropdown:"+totalelemts.size());

		
//print all the options from dropdown
		//For loop
	/*	for(int i=0;i<totalelemts.size();i++) {
	String names=totalelemts.get(i).getText();
	System.out.println(names);
		}*/
	//For each
	/*for(WebElement names:totalelemts){
		System.out.println(names.getText());*/
	
//select options from dropdown
	//For loop
	
	/*for(int i=0;i<totalelemts.size();i++)
	{
		String option=totalelemts.get(i).getText();
					
		if(option.equals("Java") || option.equals("Python"))
		{
			totalelemts.get(i).click();
		}
		
	}*/
	
//for each loop
	
	for(WebElement names1:totalelemts) {
		String text=names1.getText();
		if(text.equals("Java") || text.equals("Python"))
		{
			names1.click();
		}
	}
	
		
	

			
		
		


}}
