package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestData {

	public static void main(String[] args) throws IOException {
		
		
		//FileInputStream     //Properties (class)
		
		//FileInputStream    // XSSFWorkbook 
		
		
		FileInputStream fis = new FileInputStream("C:\\TestingProjects\\SeleniumJavaProject\\resources\\config.properties");
		
		Properties property = new Properties();
		
		property.load(fis);
		
	property.getProperty("password");
	
		

		

		

	}

}
