package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {


	public WebDriver driver;  // class variable
	
	
	
	@Test	
	 public WebDriver loginToApplication() throws IOException
	 {
	
		FileInputStream fis = new FileInputStream("C:\\TestingProjects\\SeleniumJavaProject\\resources\\config.properties");
		
		Properties prop = new Properties();
		
		prop.load(fis);
		
		if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
			WebDriverManager.chromedriver().setup();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
			driver.get(prop.getProperty("url"));
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys(prop.getProperty("username"));
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(prop.getProperty("password"));
			driver.findElement(By.xpath("//button[@type='submit']")).click();
		}
		else if(prop.getProperty("browser").equalsIgnoreCase("Firefox"))
		{
			driver = new FirefoxDriver();
			WebDriverManager.firefoxdriver().setup();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
			driver.get(prop.getProperty("url"));
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys(prop.getProperty("username"));
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(prop.getProperty("password"));
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
		}
		else if(prop.getProperty("browser").equalsIgnoreCase("edge"))
		{
		
	    driver = new EdgeDriver();
		WebDriverManager.edgedriver().setup();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get(prop.getProperty("url"));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		}
		
		
	     return driver;
		
	 }
	
	
	@Test
	  public void logout()
	  {
		  
		driver.close();
		
	  }
	
		
		

	

}
