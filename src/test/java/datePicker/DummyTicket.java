package datePicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DummyTicket
{
	@Test
	static void datePicker(WebDriver driver, String expecteddt)
	{
		SoftAssert softAssert = new SoftAssert();
		String expected = "vc";
		String actual = "vc";
		driver.findElement(By.xpath("//input[@id='dob']")).click();

		// select month
		WebElement ele = driver.findElement(By.xpath("//select[@aria-label='Select month']"));
		Select select = new Select(ele);
		select.selectByValue("3");

		// select year
		WebElement ele1 = driver.findElement(By.xpath("//select[@aria-label='Select year']"));
		Select select1 = new Select(ele1);
		select1.selectByValue("2023");

		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td//a"));

		for (WebElement dt : dates)
		{
			if (dt.getText().equals(expecteddt))
			{
				dt.click();
				break;
			}
		}

		softAssert.assertEquals(actual, expected);
		softAssert.assertAll();

	}

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		String expecteddt = "23";
		datePicker(driver, expecteddt);
	}

}
