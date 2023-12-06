package day_35;

import org.testng.annotations.*;

public class Class1 {
	@Test
	void abc()
	{
		System.out.println("abc from Class1");
	}
	
	@BeforeTest
	void m()
	{
		System.out.println("m before testmethod");
	}
	
	
}
