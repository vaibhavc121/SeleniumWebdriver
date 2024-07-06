package propertiesFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadWrite
{

	public static void main(String[] args) throws IOException
	{
		Properties properties = new Properties();
		FileInputStream inputStream = new FileInputStream(
				"D:\\OneDrive - Bharatiya Vidya Bhavans Sardar Patel Institute Of Technology\\SeleniumWebdriver\\src\\main\\resources\\properties\\testdata.properties");
		properties.load(inputStream);
		System.out.println(properties.getProperty("browser"));

		FileOutputStream outputStream = new FileOutputStream(
				"D:\\OneDrive - Bharatiya Vidya Bhavans Sardar Patel Institute Of Technology\\SeleniumWebdriver\\src\\main\\resources\\properties\\testdata.properties");
		properties.setProperty("name", "vaibhav");
		properties.store(outputStream, "my info");

	}

}
