package webDriverMethods;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assi0
{

	public static void main(String[] args)
	{
		WebDriver ob = new ChromeDriver();
		ob.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));

		ob.get("https://testautomationpractice.blogspot.com/");
		ob.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("selenium");
		ob.findElement(By.xpath("//input[@type='submit']")).click();
		ob.findElement(By.xpath("//a[normalize-space()='Selenium']")).click();
		ob.findElement(By.xpath("//a[normalize-space()='Selenium in biology']")).click();
		ob.findElement(By.xpath("//a[normalize-space()='Selenium (software)']")).click();
		ob.findElement(By.xpath("//a[normalize-space()='Selenium disulfide']")).click();
		ob.findElement(By.xpath("//a[normalize-space()='More »']")).click();

		Set<String> windowid = ob.getWindowHandles();

		/*
		 * List<String> winlist = new ArrayList<String>(windowid);
		 * 
		 * String parentid = winlist.get(0); String childid = winlist.get(1);
		 * 
		 * ob.switchTo().window(childid); ob.close();
		 */

//		List<WebElement> links = ob.findElements(By.tagName("a"));
//		System.out.println(links.size());

		for (String winlist : windowid)
		{
			String title = ob.switchTo().window(winlist).getTitle();
			System.out.println(title);

			if (title.equals("Selenium - Wikipedia"))
			{
				ob.quit();
			}
		}

	}

}
