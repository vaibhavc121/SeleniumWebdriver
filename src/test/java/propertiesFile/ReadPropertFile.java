package propertiesFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadPropertFile
{

	public static void main(String[] args) throws IOException
	{
		Properties properties = new Properties();
		String filepath = System.getProperty("user.dir") + "\\PropertiesFile\\testdata.properties";
		FileInputStream file = new FileInputStream(filepath); // open the file in reading mode
		properties.load(file);
		System.out.println(properties.getProperty("email"));

		// capture all the properties
		Set<String> keys = properties.stringPropertyNames(); // method 1
		System.out.println(keys);

		// capture all the properties
		Set<Object> allkeys = properties.keySet(); // method 2
		System.out.println(allkeys);

		// capture all the values
		Collection<Object> values = properties.values();
		System.out.println(values);

		// read all the properties and their value
		for (String key : properties.stringPropertyNames())
		{
			System.out.println(key + "	" + properties.getProperty(key));
		}
	}

}
