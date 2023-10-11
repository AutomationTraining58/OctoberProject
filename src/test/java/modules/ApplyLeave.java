package modules;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.BaseTest;

public class ApplyLeave {
	
	
	WebDriver driver2;
	
	
	// contructor is also a method
	ApplyLeave() throws IOException
	{
		BaseTest bt = new BaseTest();
	  	
	  driver2=     bt.loginToApplication();
	}
	
	
	
	@Test
	public void navigateToApplyLeaveModule()
	{
	
		//  //button[@title='Apply Leave']
		driver2.findElement(By.xpath("//button[@title='Apply Leave']")).click();
		
	}
	
	@Test
	public void newTestCase()
	{
		System.out.println("new testcase created by team member 2");
	}
	
	
	@Test
	public void creditCardTestCase()
	{
		System.out.println("testcase from member 3");
	}
	

}
