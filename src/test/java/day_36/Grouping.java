package day_36;

import org.testng.annotations.*;

public class Grouping {
	@Test(priority=1,groups={"sanity","Regression"})
	void loginbyemail()
	{
		System.out.println("this will login by email");
	}
	@Test(priority=2,groups={"sanity"})
	void loginbyfacebook()
	{
		System.out.println("this will be login by facebook");
	}
	@Test(priority=3,groups={"sanity"})
	void loginbytwitter()
	{
		System.out.println("this will be login by twitter");
	}
	@Test(priority=4,groups={"sanity","Regression"})
	void signupbyemail()
	{
		System.out.println("this will signup by email");
	}
	@Test(priority=5,groups= {"Regression"})
	void signupbyfacebook()
	{
		System.out.println("this will signup by facebook");
	}
	@Test(priority=6,groups= {"Regression"})
	void signupbytwitter()
	{
		System.out.println("this will signup by twitter");
	}
	@Test(priority=7,groups={"sanity","Regression"})
	void paymentinrupees()
	{
		System.out.println("this is payment in rupees");
	}
	@Test(priority=8,groups= {"sanity"})
	void paymentindollars()
	{
		System.out.println("this is payment in dollars");
	}
	@Test(priority=9,groups= {"Regression"})
	void paymentreturnbybank()
	{
		System.out.println("this is paymentreturn by bank");
	}



}
