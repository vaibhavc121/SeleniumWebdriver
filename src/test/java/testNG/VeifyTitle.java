package testNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VeifyTitle
{
	@Test
	static void title()
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.ebay.com/");
		String expected = "Electronics, Cars, Fashion, Collectibles & More | eBay00";
		String actual = driver.getTitle();
		Assert.assertEquals(actual, expected);

	}

	public static void main(String[] args)
	{
		title();
	}

}
