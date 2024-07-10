package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestScript
{
	// with main method
	@Test
	public static void verify()
	{
		WebDriver driver = new ChromeDriver();
		Page pg = new Page(driver);
		// Page1 pg = new Page1(driver);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");

		pg.setName("vaibhav");
		pg.setEmail("vaibhavc121@gmail.com");
		pg.setPhone("8208992890");
		pg.setAdd("pune");
	}

	public static void main(String[] args)
	{
		verify();
	}

}
