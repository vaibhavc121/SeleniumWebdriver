package checkboxes_alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAlertUsingExplicitWait
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver ob = new ChromeDriver();
		// ob.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ob.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(ob, Duration.ofSeconds(10));

		ob.get("https://the-internet.herokuapp.com/javascript_alerts");

		ob.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Thread.sleep(3000);

		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		alert.accept();
	}

}
