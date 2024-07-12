package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ListenerTest
{
	WebDriver driver;

	@BeforeClass
	void setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

	@Test(priority = 1)
	void testLogo() throws InterruptedException
	{
		Thread.sleep(3000);
		Boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		System.out.println(status);
		Assert.assertTrue(true);
	}

	@Test(priority = 2)
	void testAppURL()
	{
		Assert.assertEquals(driver.getCurrentUrl(), "dummy");
	}

	@Test(priority = 3, dependsOnMethods =
	{ "testAppURL" })
	void testHomePageTitle()
	{
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}

	@AfterClass
	void tearDown()
	{
		// driver.quit();
	}
}
