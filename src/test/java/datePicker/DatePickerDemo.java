package datePicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo
{
	// select month and yr
	static void selectMonthAndYear(WebDriver driver, String year, String month)
	{
		while (true)
		{
			String currentmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currentyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

			if (currentmonth.equals(month) && currentyear.equals(year))
			{
				break;
			}

			driver.findElement(By.cssSelector(".ui-icon.ui-icon-circle-triangle-e")).click();// next
			// driver.findElement(By.xpath("//span[@class='ui-icon
			// ui-icon-circle-triangle-w']")).click();// previous
		}

	}

	// select date
	static void selectDate(WebDriver driver, String date)
	{
		List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td//a"));

		for (WebElement dt : alldates)
		{
			if (dt.getText().equals(date))
			{
				dt.click();
				break;
			}
		}
	}

	// select past date
	static void selectPastDate(WebDriver driver, String pyear, String month, String date)
	{
		while (true)
		{
			String currentmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currentyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

			if (currentmonth.equals(month) && currentyear.equals(pyear))
			{
				break;
			}

			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();// previous

		}

		List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td//a"));

		for (WebElement dt : alldates)
		{
			if (dt.getText().equals(date))
			{
				dt.click();
				break;
			}
		}
	}

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://jqueryui.com/datepicker/");

		driver.switchTo().frame(0);

		// expected future data
		String year = "2025";
		String month = "May";
		String date = "20";

		// expected past data
		String pyear = "2022";

		driver.findElement(By.xpath("//input[@id='datepicker']")).click();

//		while (true)
//		{
//			String currentmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
//			String currentyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
//
//			if (currentmonth.equals(month) && currentyear.equals(year))
//			{
//				break;
//			}
//
//			driver.findElement(By.cssSelector(".ui-icon.ui-icon-circle-triangle-e")).click();// next
//			//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();// previous
//		}

//		List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td//a"));
//
//		for (WebElement dt : alldates)
//		{
//			if (dt.getText().equals(date))
//			{
//				dt.click();
//				break;
//			}
//		}

		selectMonthAndYear(driver, year, month);
		selectDate(driver, date);
		selectPastDate(driver, pyear, month, date);

	}

}
