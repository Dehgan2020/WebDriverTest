package webTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePageLaunch {

	
		private static final TimeUnit Second = null;

		public static void main(String [] args) {
		
		// 1- i set the properties 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sajad\\Desktop\\World of Test\\Chrome Web Driver\\chromedriver_win32\\chromedriver.exe");
		
		// 2- i create object of the webdriver
		
		WebDriver driver = new ChromeDriver();
		
		//3- i write my rest of code
		//driver.manage().timeouts().pageLoadTimeout(1, Second);
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(10, Second);
		
		


	}

}
