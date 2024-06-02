package projects.enfinity;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script
{

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		// ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.onenfinity.com/en");
		/*
		 * driver.findElement(By.
		 * xpath("//button[@class='leading-[4] px-2 text-gray-900 group rounded-md inline-flex items-center text-base font-medium productsMenu']"
		 * )).click(); driver.findElement(By.
		 * xpath("//button[@class='leading-[4] px-2 text-gray-900 group rounded-md inline-flex items-center text-base font-medium resourcesMenu']"
		 * )).click(); driver.findElement(By.
		 * xpath("//a[@class='leading-[4] px-2 text-base font-medium text-gray-900 hover:text-blue-500'][normalize-space()='Blogs']"
		 * )).click(); driver.findElement(By.
		 * xpath("//a[@class='leading-[4] px-2 text-base font-medium text-gray-900 hover:text-blue-500'][normalize-space()='Contact']"
		 * )).click(); driver.findElement(By.
		 * xpath("//a[@title='link to free trial page'][normalize-space()='Free Trial']"
		 * )).click();
		 * //driver.findElement(By.xpath("//span[@title='change language']")).click();
		 * driver.findElement(By.
		 * xpath("//a[@class='ms-6 flex items-center gap-2 whitespace-nowrap text-lg font-medium text-gray-600 cursor-pointer']"
		 * )).click(); driver.findElement(By.
		 * xpath("//img[@class='min-w-5 min-h-5 w-7 h-7 object-cover mx-auto relative']"
		 * )).click();
		 */

		driver.findElement(By.xpath(
				"//a[@class='leading-[4] px-2 text-base font-medium text-gray-900 hover:text-blue-500'][normalize-space()='Contact']"))
				.click();

		WebElement input = driver.findElement(By.xpath("//input[@id='name']"));

		// passing the text into inputbox- alternate of sendkeys()
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','vaibhav')", input);
		// clicking on element- alternate of click()
		WebElement btn = driver.findElement(By.xpath("//button[normalize-space()='Submit']"));
		js.executeScript("arguments[0].click()", btn);
	}

}
