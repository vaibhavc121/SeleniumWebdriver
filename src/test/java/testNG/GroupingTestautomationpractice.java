package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GroupingTestautomationpractice
{

	@Test(groups = "textbox")
	static void textbox()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("vaibhav");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vaibhavc121@gmail.com");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("8208992890");
		driver.findElement(By.xpath("//textarea[@id='textarea']")).sendKeys("pune");
	}

	@Test
	static void radioButton()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.findElement(By.xpath("//input[@id='male']")).click();
	}

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");
		textbox();
		radioButton();
	}

}
