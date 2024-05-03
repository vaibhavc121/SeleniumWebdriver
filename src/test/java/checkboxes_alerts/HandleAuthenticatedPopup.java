package checkboxes_alerts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAuthenticatedPopup
{

	public static void main(String[] args)
	{
		WebDriver ob = new ChromeDriver();

		// ob.get("https://the-internet.herokuapp.com/basic_auth");
		ob.get("https://admin:admin@the-internet.herokuapp.com/basic_auth"); // username:password@

	}

}
