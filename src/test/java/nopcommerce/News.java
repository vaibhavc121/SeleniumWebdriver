package nopcommerce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class News
{

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.get("https://demo.nopcommerce.com/");
		driver.findElement(By.xpath("//a[@href='/new-online-store-is-open'][normalize-space()='details']")).click();
		driver.findElement(By.cssSelector("#AddNewComment_CommentTitle")).sendKeys("vaibhav");
		driver.findElement(By.tagName("textarea")).sendKeys("comment");
		driver.findElement(By.name("add-comment")).click();
	}

}
