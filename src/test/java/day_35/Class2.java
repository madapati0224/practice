package day_35;

import org.testng.annotations.*;

public class Class2 {
	@Test
	void xyz()
	{
		System.out.println("xyz from class2");
	}
	
	@AfterTest
	void n()
	{
		System.out.println("n after testmethod");
	}
	
	
}


