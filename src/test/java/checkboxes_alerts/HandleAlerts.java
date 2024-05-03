package checkboxes_alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver ob = new ChromeDriver();
		ob.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ob.manage().window().maximize();
		ob.get("https://the-internet.herokuapp.com/javascript_alerts");

		// normal alert with ok button

//		ob.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
//		Thread.sleep(3000);
//		// ob.switchTo().alert().accept();
//		Alert alert = ob.switchTo().alert();
//		alert.accept();
//		System.out.println(alert.getText());
//		alert.accept();

		// confirmation alert- ok and cancel

//		ob.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
//		Thread.sleep(3000);
//		ob.switchTo().alert().dismiss();

		// promt alert- input box

		ob.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Thread.sleep(3000);
		Alert alert = ob.switchTo().alert();
		alert.sendKeys("hii");
		alert.accept();

	}

}
