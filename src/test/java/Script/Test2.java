package Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver ob = new ChromeDriver();
		Thread.sleep(3000);
		ob.manage().window().maximize();

	}

}
