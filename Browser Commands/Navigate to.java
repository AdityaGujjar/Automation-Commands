package navigation_commands;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_to_Command {

	public static void main(String[] args) {
		// Setting up system properties
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		
		//Initiating driver
		
		ChromeDriver driver=new ChromeDriver();
		
		//starting the code
		
		driver.navigate().to("https://www.facebook.com/");
		
		// Using navigate_to command after opening the browser. It was previously used too.
		
		driver.navigate().to("https://www.youtube.com/");
		
		driver.navigate().to("https://www.instagram.com/");
		
		//Learn how to navigate to other websites in different tabs

	}

}
