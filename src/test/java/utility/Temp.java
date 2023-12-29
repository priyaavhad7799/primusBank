package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Temp {   

	public static void main(String[] args) 
	{   
		
   //  WebDriverManager.chromedriver().setup();   
		
		//ChromeDriver driver = new ChromeDriver(); 
		
		System.setProperty("Webdriver.chrome.driver", "E:\\Automation Support\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://primusbank.qedgetech.com/");
		

		driver.findElement(By.xpath("//*[@id='txtuId']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id='txtPword']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id='login']")).click();
		driver.findElement(By.xpath("//*[@src='images/Branches_but.jpg']")).click();

		// select
		Select sel = new Select(driver.findElement(By.name("lst_countryS"))); //*[@name='lst_countryS']

		sel.selectByVisibleText("INDIA");

		Select sel1 = new Select(driver.findElement(By.name("lst_stateS")));

		sel1.selectByValue("Karnataka");// //*[@name='lst_stateS']

		Select sel2 = new Select(driver.findElement(By.name("lst_cityS")));    //*[@name='lst_cityS']

		sel2.selectByIndex(1);

		// //click on Search
		driver.findElement(By.xpath("//*[@id='btn_search']")).click();
	}


	

}
   