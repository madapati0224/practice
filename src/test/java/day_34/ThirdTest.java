package day_34;

import org.testng.annotations.Test;

public class ThirdTest {
	
	@Test(priority=1)
	public  void Test1()
	{
		System.out.println("Test1 method execute");
	}
	@Test(priority=2)
	public  void Test2()
	{
		System.out.println("Test2 method execute");
	}
	@Test(priority=3)
	public  void Test3()
	{
		System.out.println("Test3 method execute");
	}

}



