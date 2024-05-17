package webTable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable
{

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println(rows);
		int cols = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]//th")).size();
		System.out.println(cols);
		String text = driver.findElement(By.xpath("//table[@name='BookTable']//tr[2]/td[4]")).getText();
		System.out.println(text);

//		for (int i = 2; i <= 7; i++)
//		{
//			for (int j = 1; j <= 4; j++)
//			{
//				String text1 = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + i + "]/td[" + j + "]"))
//						.getText();
//				System.out.println(text1 + " ");
//			}
//			System.out.println();
//		}

//		for (int i = 2; i <= 7; i++)
//		{
//			// for (int j = 1; j <= 4; j++)
//			// {
//			String text1 = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + i + "]/td[2]")).getText();
//			if (text1.equals("Mukesh"))
//			{
//				String text2 = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + i + "]/td[1]"))
//						.getText();
//				System.out.println(text2);
//			}
//
//			// }
//			// System.out.println();
//		}
		Integer tot = 0;
		for (int i = 2; i <= 7; i++)
		{

			System.out.println(
					driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + i + "]/td[4	]")).getText());
			String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + i + "]/td[4	]")).getText();
			tot = tot + Integer.parseInt(price);

		}
		System.out.println(tot);
	}

}
