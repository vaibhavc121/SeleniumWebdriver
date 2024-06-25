package dataDrivenTesting;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import excelUtils.ExcelUtils;

public class FDCalculator
{

	public static void main(String[] args) throws IOException, InterruptedException
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get(
				"https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		String filepath = System.getProperty("user.dir") + "\\Testdata\\caldata.xlsx";
		int rows = ExcelUtils.getRowCount(filepath, "Sheet1");

		for (int i = 1; i <= rows; i++)
		{
			// read the data from the excel
			String princ = ExcelUtils.getCellData(filepath, "Sheet1", i, 0);
			String rateofint = ExcelUtils.getCellData(filepath, "Sheet1", i, 1);
			String per1 = ExcelUtils.getCellData(filepath, "Sheet1", i, 2);
			String per2 = ExcelUtils.getCellData(filepath, "Sheet1", i, 3);
			String freq = ExcelUtils.getCellData(filepath, "Sheet1", i, 4);
			String exp_mvalue = ExcelUtils.getCellData(filepath, "Sheet1", i, 5);

			// pass above data into application
			driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(princ);
			driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(rateofint);
			driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(per1);
			WebElement ele = driver.findElement(By.xpath("//select[@id='tenurePeriod']"));

			Select slct = new Select(ele);
			slct.selectByVisibleText(per2);

			Select slct1 = new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
			slct1.selectByVisibleText(freq);
			driver.findElement(By.xpath("//div[@class='cal_div']//a[1]")).click();

			// validation
			String act_mvalue = driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();
			if (Double.parseDouble(exp_mvalue) == Double.parseDouble(act_mvalue))
			{
				System.out.println("test passed");
				ExcelUtils.setCellData(filepath, "Sheet1", i, 7, "passed");
				ExcelUtils.fillGreenColor(filepath, "Sheet1", i, 7);
			}
			else
			{
				System.out.println("test failed");
				ExcelUtils.setCellData(filepath, "Sheet1", i, 7, "failed");
				ExcelUtils.fillRedColor(filepath, "Sheet1", i, 7);
			}

			Thread.sleep(3000);
			driver.findElement(By.xpath("//img[@class='PL5']")).click();
		}
	}

}
