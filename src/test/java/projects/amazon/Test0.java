package projects.amazon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test0
{

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.amazon.in/");
//		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("laptop");
//		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
//		driver.findElement(By.xpath("//span[contains(text(),'Apple 2023 MacBook Pro (14-inch, M3 Max chip with ')]"))
//				.click();

		// --workflow
		WebElement ele = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select select = new Select(ele);
		select.selectByValue("search-alias=apparel");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("//span[@dir='auto'][normalize-space()='Men']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'T-shirts, Polos & Shirts')]")).click();
		driver.findElement(By.xpath("//img[@alt='ceremony']")).click();
		driver.findElement(
				By.xpath("//a[@aria-label='Multi - Blue']//span[@class='s-color-swatch-inner-circle-border']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Men']")).click();
	}

}
