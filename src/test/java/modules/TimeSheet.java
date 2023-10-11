package modules;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.BaseTest;
import base.TestData;

public class TimeSheet {
	
	
	WebDriver driver2;
	
	// constrcutor is also a method
	TimeSheet() throws IOException
	{
		BaseTest bt = new BaseTest();
	   driver2=    bt.loginToApplication();
	}
	
	
	@Test
	public void clickOnTimeSheet()
	{
		
		
		driver2.findElement(By.xpath("//button[@title='My Timesheet']")).click();
		
	}
	
	@Test
	public void testCaseCreatedFromDevelopmentBranch()
	{
		
		
		driver2.findElement(By.xpath("//button[@title='My Timesheet']")).click();
		
	}
	
	
	
	

}
