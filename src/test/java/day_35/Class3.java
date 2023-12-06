package day_35;

import org.testng.annotations.*;

public class Class3 {
	@Test
	void login()
	{
		System.out.println("login");
	}
	@BeforeTest
	void Searchurl()
	{
		System.out.println("searchurl");
	}
	
	@BeforeSuite
	void bs()
	{
		System.out.println("execute before the all testmethods");
	}

	@AfterSuite
	void as()
	{
		System.out.println("execute After the all testmethods");
	}
}
