package baseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass
{
	WebDriver driver;

	@BeforeClass
	public void setup()
	{
		Reporter.log("session started", true);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Reporter.log("application started", true);
	}

	@AfterClass
	public void afterClass()
	{
		driver.quit();
		Reporter.log("session end", true);
	}
}
