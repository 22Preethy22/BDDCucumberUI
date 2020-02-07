package in.com.hcl.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ConfigFileReader
{
	private static Properties properties,locatorprop;
	private final static String propertyFilePath= "Resources/Config.properties";
	private final static String locatorFilePath= "Resources/Locator.properties";

	
	public ConfigFileReader(){
		BufferedReader reader,reader1;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			//reader1 = new BufferedReader(new FileReader(locatorFilePath));
			
			properties = new Properties();
			//properties1=new Properties();
			try {
				properties.load(reader);
				reader.close();
				//properties1.load(reader1);
				reader.close();
				
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}		
	}
	public static void locatorFileReader(){
		BufferedReader reader,reader1;
		try {
			//reader = new BufferedReader(new FileReader(propertyFilePath));
			reader = new BufferedReader(new FileReader(locatorFilePath));
			
			locatorprop = new Properties();
			//properties1=new Properties();
			try {
				locatorprop.load(reader);
				reader.close();
				//properties1.load(reader1);
				//reader.close();
				
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}		
	}
	
	
	
	
	/*public String getDriverPath(){
		String driverPath = properties.getProperty("driverPath");
		if(driverPath!= null) return driverPath;
		else throw new RuntimeException("driverPath not specified in the Configuration.properties file.");		
	}
	
	public long getImplicitlyWait() {		
		String implicitlyWait = properties.getProperty("implicitlyWait");
		if(implicitlyWait != null) return Long.parseLong(implicitlyWait);
		else throw new RuntimeException("implicitlyWait not specified in the Configuration.properties file.");		
	}*/
	
	public static String getApplicationUrl() {
	String url = properties.getProperty("url");
		if(url != null) return url;
		else throw new RuntimeException("url not specified in the Configuration.properties file.");
	}
	/*public static By getlocator(String field) {		
		
		String locator = locatorprop.getProperty(field);	
		System.out.println(locator);
		if(locator != null) return By.xpath(locator);
		else throw new RuntimeException("locator not specified in the locator.properties file.");
	}*/

}