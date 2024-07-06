package propertiesFile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WritePropertiesFile
{

	public static void main(String[] args) throws IOException
	{
		Properties properties = new Properties();
		properties.setProperty("email", "vaibhavc121@gmail.com");
		properties.setProperty("gender", "male");
		String filepath = System.getProperty("user.dir") + "\\PropertiesFile\\testdata.properties"; // return current
																									// project location
		FileOutputStream file = new FileOutputStream(filepath); // open the file in writing mode
		properties.store(file, "sample data");
		file.close();
	}

}
