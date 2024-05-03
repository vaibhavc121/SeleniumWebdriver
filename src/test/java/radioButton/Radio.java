package radioButton;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver ob = new ChromeDriver();
		ob.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ob.manage().window().maximize();

		ob.get("https://testautomationpractice.blogspot.com/");

		ob.findElement(By.xpath("//input[@id='male']")).click();
		Thread.sleep(3000);
		ob.findElement(By.xpath("//input[@id='female']")).click();

	}

}
