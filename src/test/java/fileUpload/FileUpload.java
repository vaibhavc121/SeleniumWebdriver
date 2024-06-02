package fileUpload;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload
{

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("D:\\OneDrive - Bharatiya Vidya Bhavans Sardar Patel Institute Of Technology\\#Other\\MEGA-RECOVERYKEY.txt");

	}

}
