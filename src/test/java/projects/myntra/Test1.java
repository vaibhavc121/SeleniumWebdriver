package projects.myntra;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1
{

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.myntra.com/");
		driver.findElement(By.xpath("//a[@class='desktop-main'][normalize-space()='Men']")).click();
		// driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath(
				"//div[6]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//a[1]//picture[1]//img[1]"))
				.click();
		// driver.findElement(By.xpath("//label[normalize-space()='Men']")).click();
		driver.findElement(
				By.xpath("//div[@class='vertical-filters-filters brand-container']//li[1]//label[1]//div[1]")).click();
		driver.findElement(By.xpath("//ul[@class='price-list']//li[4]//label[1]//div[1]")).click();
		driver.findElement(By.xpath("//div[4]//ul[1]//li[1]//label[1]//div[1]")).click();
		driver.findElement(By.xpath("//label[normalize-space()='50% and above']")).click();
	}

}
