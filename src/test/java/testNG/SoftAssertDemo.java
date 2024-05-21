package testNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo
{
	@Test
	void title()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.ebay.com/");

		SoftAssert SoftAssert = new SoftAssert();
		String expected = "Electronics, Cars, Fashion, Collectibles & More | eBay00";
		String actual = driver.getTitle();
		SoftAssert.assertEquals(actual, expected, "title verification failed");

		System.out.println("2nd test case start");

		String expected1 = "Electronics, Cars, Fashion, Collectibles & More | eBay00";
		String actual1 = driver.getTitle();
		SoftAssert.assertEquals(actual1, expected1, "title verification failed");
		System.out.println("2nd test case end");
		SoftAssert.assertAll();

	}
}
