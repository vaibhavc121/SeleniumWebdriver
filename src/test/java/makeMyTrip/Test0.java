package makeMyTrip;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0
{

	public static void main(String[] args) throws InterruptedException
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.cssSelector(".commonModal__close")).click();
//		driver.findElement(By.cssSelector("input[placeholder='Enter Mobile Number']")).sendKeys("7769967226");
//		driver.findElement(By.xpath("//button[@class='capText font16']")).click();
		driver.findElement(By.xpath("//label[@for='fromCity']")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("kolkata");
		Thread.sleep(3);
//		driver.findElement(By.xpath("//span[contains(text(),'Kolkata')]"));
//		List<WebElement> ele = driver
//				.findElements(By.xpath("//span[@class='makeFlex flexOne spaceBetween appendRight10']"));
//
//		for (int i = 0; i < ele.size(); i++)
//		{
//			String text = ele.get(i).getText();
//			System.out.println(text);
//			if (text.contains("Kolkata"))
//			{
//				ele.get(i).click();
//				break;
//			}

//		}

		driver.findElement(By.xpath("//p[normalize-space()='Netaji Subhash Chandra Bose International Airport']"))
				.click();

	}

}
