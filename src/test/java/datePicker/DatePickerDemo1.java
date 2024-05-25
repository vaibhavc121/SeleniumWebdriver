package datePicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerDemo1
{

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.switchTo().frame("frame-one796456169");
		driver.findElement(By.xpath("//span[@role='button' and @class='icon_calendar']")).click();
		WebElement ele = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select select = new Select(ele);
		select.selectByValue("2023");

		String month = "April";
		String date = "23";

		while (true)
		{
			String actualmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			if (actualmonth.equals(month))
			{
				break;
			}

			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
		}

		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td/a"));

		for (WebElement dt : dates)
		{
			if (dt.getText().equals(date))
			{
				dt.click();
				break;
			}
		}

		String texts = driver.findElement(By.xpath("//input[@placeholder='mm/dd/yyyy']")).getText();

		System.out.println(texts);
	}

}
