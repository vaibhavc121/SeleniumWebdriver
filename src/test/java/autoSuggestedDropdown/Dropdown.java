package autoSuggestedDropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(5000);
		List<WebElement> ele = driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
		System.out.println(ele.size());

		// ele.get(1).click();
		for (int i = 0; i < ele.size(); i++)
		{
			ele.get(i).getText();
			if (ele.get(i).getText().equals("selenium"))
			{
				ele.get(i).click();
				break;
			}
		}
	}

}
