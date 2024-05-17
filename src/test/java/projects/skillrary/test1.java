package projects.skillrary;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1
{

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://skillrary.com/");
		driver.findElement(By.xpath("//a[normalize-space()='CATEGORIES']")).click();
		driver.findElement(By.xpath("//ul[@id='category_li']//a[normalize-space()='Analytics']")).click();

	}

}
