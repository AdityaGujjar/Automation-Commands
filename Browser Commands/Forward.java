package navigation_commands;

import org.openqa.selenium.chrome.ChromeDriver;

public class Forward_command {

	public static void main(String[] args) throws InterruptedException {
		// Setting up system properties
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		
		//Initiating the driver
		
		ChromeDriver driver=new ChromeDriver();
		
		//Starting the code
		
		driver.navigate().to("https://www.facebook.com/");
		
		Thread.sleep(5000);
		
		//Using back command so that we can use forward command
		
		driver.navigate().back();
		
		Thread.sleep(5000);
		
		//Using forward command
		
		driver.navigate().forward();
		

	}

}
