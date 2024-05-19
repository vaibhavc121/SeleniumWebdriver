package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest
{
	@BeforeTest
	static void beforeTest()
	{
		System.out.println("before test");
	}

	@AfterTest
	static void afterTest()
	{
		System.out.println("after test");
	}

	@BeforeMethod
	static void beforeMethod()
	{
		System.out.println("before method");
	}

	@AfterMethod
	static void afterMethod()
	{
		System.out.println("after method");
	}

	@Test(priority = 1)
	static void b()
	{
		System.out.println("b display");
	}

	@Test(priority = 2)
	static void a()
	{
		System.out.println("a display");
	}

	public static void main(String[] args)
	{
		// LoginTest ob=new LoginTest();
		// ob.display();
		a();
		b();
		beforeTest();
		afterTest();
		beforeMethod();
		afterMethod();

	}

}
