package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver ob = new ChromeDriver();
		ob.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ob.manage().window().maximize();

		ob.get("https://testautomationpractice.blogspot.com/");
		Select select = new Select(ob.findElement(By.xpath("//select[@id='country']")));
//		select.selectByIndex(1);
//		Thread.sleep(3000);
//		select.selectByVisibleText("India");
//		Thread.sleep(3000);
//		select.selectByValue("brazil");

		List<WebElement> options = select.getOptions();

		System.out.println(options.size());
		for (WebElement country : options)
		{
			// System.out.println(country.getText());
			System.out.println(country);
			System.out.println(country.getText()); // direct method because we are not using index here
		}

		for (int i = 0; i < options.size(); i++)
		{
			System.out.println(options.get(i).getText());
		}

	}

}
