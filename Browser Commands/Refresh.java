package navigation_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Refresh_command {

	public static void main(String[] args) throws InterruptedException {
		// Setting up System properties
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\latest\\chromedriver_win32\\chromedriver.exe");
		
		//Initiating the driver
		
		ChromeDriver driver=new ChromeDriver();
		
		//Starting the code
		
		driver.navigate().to("https://www.facebook.com/");
		
		driver.findElement(By.name("email")).sendKeys("Aditya");
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
	}

}
