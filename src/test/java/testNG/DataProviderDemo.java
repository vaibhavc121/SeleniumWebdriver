package testNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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

	@Test
	void testlogin()
	{
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
	}

	@AfterClass
	void teardown()
	{

	}

	@DataProvider
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
