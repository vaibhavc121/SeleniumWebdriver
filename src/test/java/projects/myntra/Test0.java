package projects.myntra;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test0
{

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.myntra.com/");
		WebElement ele = driver.findElement(By.xpath("//a[@class='desktop-main'][normalize-space()='Men']"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		driver.findElement(By.xpath("//a[@href='/men-tshirts']")).click();
		driver.findElement(By.xpath("//li[1]//a[1]//div[2]//div[1]//span[1]//span[1]")).click();
//		Set<String> set = driver.getWindowHandles();
//		List<String> list = new ArrayList<String>(set);
//		String child = list.get(0);
//		driver.switchTo().window(child);
		driver.findElement(By.cssSelector("input[placeholder='Enter pincode']")).sendKeys("416310");
		driver.findElement(By.xpath("//button[normalize-space()='Change']")).click();

		driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconUser sprites-headerUser']")).click();
		driver.findElement(By.xpath("//div[normalize-space()='Contact Us']")).click();
		driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconUser sprites-headerUser']")).click();
		driver.findElement(By.xpath("//div[normalize-space()='Myntra Credit']")).click();
	}

}
