package brokenLinks;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks
{

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("http://www.deadlinkcity.com/");
		// capture all the links from website
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		int noofbrokenlinks = 0;

		for (WebElement link : links)
		{
			String hrefvalue = link.getAttribute("href");
			if (hrefvalue == null || hrefvalue.isEmpty())
			{
				System.out.println("value is null or empty so not possible to check");
				continue;
			}

			// hit url to the server
			try
			{

				URL linkUrl = new URL(hrefvalue); // converted href value from string to url format
				HttpURLConnection conn = (HttpURLConnection) linkUrl.openConnection(); // open connection to the server
				conn.connect(); // connect to the server and send request to the server
				if (conn.getResponseCode() >= 400)
				{
					System.out.println(hrefvalue + "broken link");
					noofbrokenlinks++;
				}
				else
				{
					System.out.println(hrefvalue + "not a broken link");
				}
			}
			catch (Exception e)
			{
				// TODO: handle exception
			}

		}
		System.out.println("no of broken links:" + noofbrokenlinks);
	}

}
