package testNG;

import org.testng.annotations.Test;

@Test(groups = "class")
public class Grouping
{
	@Test(groups = "smoke")
	void test1()
	{
		System.out.println("test 1");
	}

	@Test(groups = "smoke")
	void test2()
	{
		System.out.println("test 2");
	}

	@Test(groups = "functional")
	void test3()
	{
		System.out.println("test 3");
	}

	@Test(groups = "integration")
	void test4()
	{
		System.out.println("test 4");
	}

	@Test(groups =
	{ "integration", "BVT" })
	void test5()
	{
		System.out.println("test 5");
	}
}
