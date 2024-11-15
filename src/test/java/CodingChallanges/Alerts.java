package CodingChallanges;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts
{

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[text()='Simple Alert']")).click();

//		 1.
//		 Alert alert= driver.switchTo().alert();
//		 alert.accept();

		// 2. explicit wait
//		WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		Alert alert = myWait.until(ExpectedConditions.alertIsPresent());
//		alert.accept();

		// 3. javascriptExecutor
		JavascriptExecutor js = (JavascriptExecutor) driver;
		try
		{
			js.executeScript("window.alert=function{};");
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}

	}

}
