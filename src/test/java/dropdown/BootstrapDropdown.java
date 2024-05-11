package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropdown
{

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		// select single option
		driver.findElement(By.xpath("//input[@value='jQuery']")).click();
		List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
		System.out.println(options.size());

//		for (int i = 0; i < options.size(); i++)
//		{
//			options.get(i).click();
//			//options.get(i).getText();
//		}

		for (WebElement op : options)
		{
			if (op.getText().equals("Java") || op.getText().equals("Python") || op.getText().equals("MySQL"))
			{
				op.click();
			}
		}
	}

}
