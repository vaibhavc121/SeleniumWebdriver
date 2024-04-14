package Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Test1
{

	public static void main(String[] args)
	{
		// WebDriver ob = new ChromeDriver();
		WebDriver ob = new EdgeDriver();
		ob.get("https://demo.nopcommerce.com/");
		String act_title = ob.getTitle();

		if (act_title.equals("nopCommerce demo store"))
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("failed");
		}

	}

}
