package extentReportingDemo;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class NewTest
{
	@Test
	public void extentTest()
	{
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("ExtentReport.html"); // html file will be generated
		extent.attachReporter(spark);

		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("MyReport");
		spark.config().setReportName("Extent report");

		ExtentTest test = extent.createTest("login test").assignCategory("vaibhav").assignCategory("smoke")
				.assignCategory("regression").assignDevice("chrome"); // create a test node in the report
		test.pass("login started"); // create a test step node in the report
		test.info("url is loaded");
		test.info("values entered");
		test.pass("login test completed");

		ExtentTest test1 = extent.createTest("homepage test").assignAuthor("vaibhav").assignAuthor("rohit")
				.assignCategory("regression"); // create a test node in the report
		test1.pass("homepage started"); // create a test step node in the report
		test1.pass("url is loaded");
		test1.pass("values entered");
		test1.fail("homepage test completed");

		extent.flush(); // unless u call this method, your report will not be written with logs

	}

}
