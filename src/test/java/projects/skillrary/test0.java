package projects.skillrary;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test0
{

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://skillrary.com/");
		// driver.findElement(By.xpath("//button[@id='gdpr-cookie-accept']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search for Courses']")).sendKeys("java");
		driver.findElement(By.xpath("//input[@value='go']")).click();
		driver.findElement(By
				.xpath("//div[@class='leak_coursing clearfix']//div[1]//div[1]//div[1]//div[1]//div[2]//a[1]//img[1]"))
				.click();
	}

}
