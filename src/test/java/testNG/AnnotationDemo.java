package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationDemo
{
	@BeforeSuite
	void bs()
	{
		System.out.println("before suit");
	}

	@AfterSuite
	void as()
	{
		System.out.println("after suit");
	}

	@BeforeTest
	void bt()
	{
		System.out.println("before test");
	}

	@AfterTest
	void at()
	{
		System.out.println("after test");
	}

	@BeforeMethod
	void bm()
	{
		System.out.println("before method");
	}

	@AfterMethod
	void am()
	{
		System.out.println("after method");
	}

	@Test
	void tm()
	{
		System.out.println("main test");
	}
}
