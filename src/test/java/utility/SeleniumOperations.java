package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import mapping.ConfigReader;

public class SeleniumOperations 
{  
	public static ConfigReader config;
	
	public  static WebDriver driver=new ChromeDriver();
	
	public static void LaunchBrowser(Object []inputparameters)
	{
		
		
		try {
			
		String bname=(String) inputparameters[0];
	//	String exepath=(String) inputparameters[1];
		
		
		
		if(bname.equalsIgnoreCase("chrome")) 
		{ 
			 config = new ConfigReader();
			
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		System.setProperty("webdriver.chrome.driver", config.getDriverPathChrome());
		
               
		 driver.manage().window().maximize();
		} 
		else if (bname.equalsIgnoreCase("Firefox"))
		{
		
			System.setProperty("webdriver.gecko.driver", config.getDriverPathFF());
		//	 driver= new FirefoxDriver();
			 driver.manage().window().maximize();
		}
	}
	catch(NullPointerException e)
	{
		System.out.println(e);	
		
	}
	}
	public static void openApp()
	{ try {
		
	//	String link=(String) inputparameters[0];
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get(config.getApplicationUrl());
	}catch(Exception e)
	{
	
	}
	}
	public static void sendkyes(Object []inputparameters)
	{
		try {
			
		String XPATH=(String) inputparameters[0];
		String value=(String) inputparameters[1];
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath(XPATH)).sendKeys(value);
		
		}catch(Exception e)
		{
			
		}
	}
	public static void click(Object []inputparameters)
	{  try {
		String XPath=(String) inputparameters[0];
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath(XPath)).click();
	}catch(Exception e)
	{
		
	}
	}
	public static void select(Object []inputparameters)
	{   
		String XPATH=(String) inputparameters[0];
		String data=(String) inputparameters[1];
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Select sel= new Select(driver.findElement(By.name(XPATH)));
		sel.selectByValue(data);
		
	}
	public static void validation(Object []inputparameters)
	{
		System.out.println("===========================");
		String XPATH=(String) inputparameters[0];
		String giventext=(String) inputparameters[1];
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		String findText=driver.findElement(By.xpath(XPATH)).getText();
	System.out.println(findText + "  <<<<<<<  finded text");
	System.out.println(giventext + "  <<<<<<<  given text");	
		if(findText.equals(giventext))
		{
		System.out.println("Test Case Pass");
		}
		else
		{
		System.out.println("Test Case fail");
		}
	
	
	}

}
