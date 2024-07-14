package listener_ExtentReport;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener
{
	public ExtentSparkReporter sparkReporter; // ui of the report
	public ExtentReports extent; // populate common info on the report
	public ExtentTest test; // creating test case entries in the report and update status of the test
							// methods

	public void onStart(ITestContext context)
	{
		sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "/reports/extentReport.html"); // specify
																												// the
																												// folder
																												// location
		// report name should be generate dynamically

		sparkReporter.config().setDocumentTitle("Automation report"); // title of the report
		sparkReporter.config().setReportName("functional testing"); // name of the report
		sparkReporter.config().setTheme(Theme.DARK);

		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);

		// values should be fetch at runtime
		extent.setSystemInfo("computer name", "localhost");
		extent.setSystemInfo("env", "QA");
		extent.setSystemInfo("tester name", "vaibhav");
		extent.setSystemInfo("os", "win11");
		extent.setSystemInfo("browser name", "chrome");
	}

	public void onTestSuccess(ITestResult result)
	{
		test = extent.createTest(result.getName()); // create new entry in the report
		test.log(Status.PASS, "test case passed is: " + result.getName()); // update status p/f/s
	}

	public void onTestFailure(ITestResult result)
	{
		test = extent.createTest(result.getName());
		test.log(Status.FAIL, "test case failed is: " + result.getName());
		test.log(Status.FAIL, "test case failed cause is: " + result.getThrowable());
		// ss attachment in report is missing here
	}

	public void onTestSkipped(ITestResult result)
	{
		test = extent.createTest(result.getName());
		test.log(Status.SKIP, "test case skipped is: " + result.getName());
	}

	public void onFinish(ITestContext context) // mandatory method
	{
		extent.flush();
	}

}
