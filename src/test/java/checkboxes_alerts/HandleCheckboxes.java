package checkboxes_alerts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckboxes
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver ob = new ChromeDriver();
		ob.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ob.manage().window().maximize();
		ob.get("https://testautomationpractice.blogspot.com/");
		List<WebElement> checkbox = ob.findElements(By.xpath("//input[@class='form-check-input'][@type='checkbox']"));

//		for (int i = 0; i < checkbox.size(); i++)
//		{
//			checkbox.get(i).click();
//		}

//
//		for (WebElement checkbox1 : checkbox)
//		{
//			checkbox1.click();
//		}

		// select last 3 checkboxes
		// total no of checkboxes- how many checkbox want to select= starting index
		// 7-3=4 (starting index)

//		for (int i = 4; i < checkbox.size(); i++)
//		{
//			checkbox.get(i).click();
//		}

		// select 1st three checkboxes
//		for (int i = 0; i < 3; i++)
//		{
//			checkbox.get(i).click();
//		}

		// unselect checkbox if they are selected

		for (int i = 0; i < 3; i++)
		{
			checkbox.get(i).click();
		}

		Thread.sleep(3000);

		for (int i = 0; i < checkbox.size(); i++)
		{
			if (checkbox.get(i).isSelected())
			{
				checkbox.get(i).click();
			}

		}

	}

}
