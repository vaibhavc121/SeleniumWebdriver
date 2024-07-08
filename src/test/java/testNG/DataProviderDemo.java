package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo
{
	WebDriver driver;

	@BeforeClass
	void setup()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test(dataProvider = "dp")
	void testlogin(String email, String pwd) throws InterruptedException // according to type of data provide the data
																			// type of parameters
	{
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(2000);
		Assert.assertTrue(false);

	}

	@AfterClass
	void teardown()
	{

	}

	@DataProvider(name = "dp", indices =
	{ 0, 4 })
	Object[][] logindata()
	{
		Object data[][] =
		{
				{ "abc@gmail.com", "testi23" },
				{ "xyz@gmail.com", "teste12" },
				{ "john@gmail.com", "test@123" },
				{ "pavan01123@gmai1.com", "tegt@123" },
				{ "johncanedy@gmail.com", "test" }, };
		return data;
	}
}
