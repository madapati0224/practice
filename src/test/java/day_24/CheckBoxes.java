package day_24;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		
	//	System.setProperty("WebDriver.driver.chrome", "C:\\Users\\HP\\Downloads\\chromedriver-win64");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://phppot.com/demo/getting-checkbox-values-in-jquery/");
		
		driver.manage().window().maximize();
		
//select specific one checkbox
		
		//driver.findElement(By.xpath("//input[@id='language1' ]")).click(); 
		
//Total number of checkboxes
		
	//List<WebElement> checkboxes =driver.findElements(By.xpath("//input[@name='language'][@type='checkbox']")); //or
	List<WebElement> checkboxes =driver.findElements(By.xpath("//input[@name='language'and@type='checkbox']"));
	
	System.out.println("Total no of checkboxes:"+checkboxes.size());//4
	
//Select all the checkboxes-We can select by using for loop (or) Enhanced forloop
	
	/*By usinf for loop
	
	for(int i=0;i<checkboxes.size();i++) {
		checkboxes.get(i).click();
	}*/
	
	/*By for each loop
	
	for(WebElement checkbox:checkboxes) {
		checkbox.click();
	}*/
	
//Select last 3 checkboxes-->totalcheckboxes-want to select chkboxes=Starting index(for each can't use bec based on index we have to select the checkbox)
	
	/*for(int i=1;i<checkboxes.size();i++) { //4-3=1(starting index)
		checkboxes.get(i).click();
	}*/
	
//Select first 3 checkboxes
	
	/*for(int i=0;i<checkboxes.size();i++) {  
		if(i<3)
	checkboxes.get(i).click();
	}*/
	
	//or
	
	/*for(int i=0;i<3;i++) {
		checkboxes.get(i).click();
	}*/
	
//check and Uncheck all checkboxes
	
//By for each loop cheking the checkboxes
	
/*	for(WebElement checkbox:checkboxes) {
		checkbox.click();
	}
	Thread.sleep(1000);
	
//Uncheck all checkboxes
	
	for(WebElement checkbox:checkboxes) {
		if(checkbox.isSelected());
		checkbox.click();
	}*/
	
//Select and unselect first 3 checkboxes 
	
	 //Select 3 checkboxes
	
	for(int i=0;i<3;i++) {
		checkboxes.get(i).click();
	}
	Thread.sleep(1000);
	
	//unSelect 3 checkboxes
	
	for(int i=0;i<3;i++) {
		if(checkboxes.get(i).isSelected())
		checkboxes.get(i).click();
	}
	
	
	
	
	
	
	
	
	
		
	//driver.close();	

	}

}
